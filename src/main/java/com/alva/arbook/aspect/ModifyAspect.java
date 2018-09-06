package com.alva.arbook.aspect;


import com.alva.arbook.annotation.Modify;
import com.alva.arbook.entity.SysLogT;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.parser.ContentParser;
import com.alva.arbook.service.SysLogTService;
import com.alva.arbook.util.ModifyName;
import com.alva.arbook.util.ReflectionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 拦截@logAnnotation注解的方法
 * 将具体修改存储到数据库中
 * Created by wwmxd on 2018/03/02.
 */
@Aspect
@Component
@ConditionalOnBean(SysLogTService.class)
public class ModifyAspect {

    private final static Logger logger = LoggerFactory.getLogger(ModifyAspect.class);

    private SysLogT log = new SysLogT();

    private Object oldObject;

    private Object newObject;

    private Map<String, Object> feildValues;

    @Autowired
    private SysLogTService sysLogTService;

    @Before("@annotation(modify)")
    public void doBefore(JoinPoint joinPoint, Modify modify) {
        // 所有切面中的第一个参数必须是对象类型
        Object info = joinPoint.getArgs()[0];
        String[] feilds = modify.feildName();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        log.setUsername(BaseContextHandler.getName());
//        log.setModifyip(ClientUtil.getClientIp(request));
//        log.setModifydate(sdf.format(new Date()));
//        String handelName = log.handleName();
//        if ("".equals(handelName)) {
//            log.setModifyobject(request.getRequestURL().toString());
//        } else {
//            log.setModifyobject(handelName);
//        }
//        log.setModifyname(logAnnotation.name());
//        log.setModifycontent("");
        //
        if (ModifyName.UPDATE.equals(modify.description()) || ModifyName.DELETE.equals(modify.description())) {
            for (String feild : feilds) {
                feildValues = new HashMap<>();
                Object result = ReflectionUtils.getFieldValue(info, feild);
                feildValues.put(feild, result);
            }
            try {
                ContentParser contentParser = (ContentParser) modify.parseclass().newInstance();
                oldObject = contentParser.getResult(feildValues, modify);
            } catch (Exception e) {
                logger.error("service加载失败:", e);
            }
        }

//        else {
//            //if (ModifyName.UPDATE.equals(logAnnotation.name())) {
//            logger.error("id查询失败，无法记录日志");
//            //}
//        }

    }

    @AfterReturning(pointcut = "@annotation(modify)", returning = "object")
    public void doAfterReturing(Object object, Modify modify) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 修改操作
        if (ModifyName.UPDATE.equals(modify.description())) {
            ContentParser contentParser = null;
            try {
                contentParser = (ContentParser) modify.parseclass().newInstance();
                newObject = contentParser.getResult(feildValues, modify);
            } catch (Exception e) {
                logger.error("service加载失败:", e);
            }

            try {
                List<Map<String, Object>> changelist = ReflectionUtils.compareTwoClass(oldObject, newObject);
                StringBuilder str = new StringBuilder();
                if (changelist.size() != 0) {
                    for (Map<String, Object> map : changelist) {
                        str.append("【" + map.get("name") + "】从【" + map.get("old") + "】改为了【" + map.get("new") + "】;\n");
                    }
                } else {
                    str.append("修改前后数据一致");
                }
                log.setSzDetail(str.toString());
            } catch (Exception e) {
                logger.error("比较异常", e);
            }
        } else if (ModifyName.DELETE.equals(modify.description())) {// 删除操作
            try {
                List<Map<String, Object>> classContent = ReflectionUtils.getClassContent(oldObject);
                StringBuilder str = new StringBuilder();
                for (Map<String, Object> map : classContent) {
                    str.append("【" + map.get("name") + "】:【" + map.get("value") + "】;\n");
                }
                log.setSzDetail(str.toString());
            } catch (Exception e) {
                logger.error("service加载失败:", e);
            }
        } else if (ModifyName.SAVE.equals(modify.description())) {
//
//            Object info = joinPoint.getArgs()[0];
//            String[] feilds = modify.feildName();
//
//            for (String feild : feilds) {
//                feildValues = new HashMap<>();
//                Object result = ReflectionUtils.getFieldValue(info, feild);
//                feildValues.put(feild, result);
//            }
//            try {
//                ContentParser contentParser = (ContentParser) modify.parseclass().newInstance();
//                oldObject = contentParser.getResult(feildValues, modify);
//            } catch (Exception e) {
//                logger.error("service加载失败:", e);
//            }
//
            /**
             * ReflectionUtils.getClassContent(object)中的参数object
             * 来自于@AfterReturning(pointcut = "@annotation(modify)", returning = "object")
             */
            try {
                List<Map<String, Object>> classContent = ReflectionUtils.getClassContent(object);
                StringBuilder str = new StringBuilder();
                for (Map<String, Object> map : classContent) {
                    str.append("【" + map.get("name") + "】:【" + map.get("value") + "】;\n");
                }
                log.setSzDetail(str.toString());
            } catch (Exception e) {
                logger.error("service加载失败:", e);
            }

        }

        String szTitle = modify.handleName();
        log.setSzTitle(szTitle);
        if (szTitle.indexOf("教材") != -1) {
            log.setSzType("教材");
        } else if (szTitle.indexOf("用户") != -1) {
            log.setSzType("用户");
        }
        //读取session中的用户
        HttpSession session = request.getSession();
        SysUserT sysUserT = (SysUserT) session.getAttribute("user");
        if (sysUserT != null) {
            log.setSzEmail(sysUserT.getSzEmail());
        } else {
            log.setSzEmail("未登录用户");
        }
        Map<String, String[]> params = request.getParameterMap(); //请求提交的参数
        // 删除和修改操作时,获取删除或修改对象的id  为了方便 使用数据库字段sz_method存储id
//        String[] ids = params.get("id");
//        for (String id : ids) {
//            log.setSzMethod(id);
//        }
        sysLogTService.insert(log);
    }
}
