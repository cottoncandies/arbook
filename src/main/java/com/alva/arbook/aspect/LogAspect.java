package com.alva.arbook.aspect;

import com.alva.arbook.annotation.LogAnnotation;
import com.alva.arbook.entity.SysLogT;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysLogTService;
import com.alva.arbook.util.UUIDUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;

@Aspect
@Component
public class LogAspect {

    @Autowired
    private SysLogTService sysLogTService;

    @Autowired(required = false)
    private HttpServletRequest request;


    /**
     * Controller层切点 注解拦截
     */
    @Pointcut("@annotation(com.alva.arbook.annotation.LogAnnotation)")
    public void logAspect() {
    }


    @Around("logAspect()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        //读取session中的用户
        HttpSession session = request.getSession();
        SysUserT sysUserT = (SysUserT) session.getAttribute("user");

        Object proceed = point.proceed();


        if (sysUserT != null) {
            String title = getMethodDescription(point);
            String type = "info";                       //日志类型(info:入库,error:错误)
            String remoteAddr = request.getRemoteAddr();//请求的IP
            String requestUri = request.getRequestURI();//请求的Uri
            String method = request.getMethod();        //请求的方法类型(post/get)
            Map<String, String[]> params = request.getParameterMap(); //请求提交的参数

            SysLogT log = new SysLogT();
            log.setSzId(UUIDUtils.createUUID());
            log.setSzTitle(title);
            log.setSzType(type);
            log.setSzRemoteAddr(remoteAddr);
            log.setSzRequestUri(requestUri);
            log.setSzMethod(method);
            log.setMapToParams(params);
            log.setSzEmail(sysUserT.getSzEmail());
            log.setTsCreated(new Date());

            //直接执行保存操作
            this.sysLogTService.insert(log);
        }
        return proceed;
    }

    /**
     * 获取注解中对方法的描述信息
     *
     * @param point 切点
     * @return discription
     */
    public static String getMethodDescription(ProceedingJoinPoint point) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        LogAnnotation logAnnotation = method.getAnnotation(LogAnnotation.class);
        String discription = logAnnotation.description();
        return discription;
    }
}