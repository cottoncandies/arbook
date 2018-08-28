package com.alva.arbook.controller;

import com.alva.arbook.dao.SysLogTMapper;
import com.alva.arbook.service.SysLogTService;
import com.alva.arbook.vo.LogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/log")
public class SysLogTController {

    @Autowired
    private SysLogTService sysLogTService;

    @Resource
    private SysLogTMapper sysLogTMapper;

    @RequestMapping("/getlogs")
    public Map getlog(Integer page, Integer limit) {
        HashMap<String, Object> map = new HashMap<>();
        List<LogVO> logVOS = sysLogTService.selectAllByPage(page, limit);
        map.put("code", 0);//查询状态
        map.put("msg", "提交成功");//消息提示
        map.put("count", sysLogTMapper.selectAllCount());//查询总数
        map.put("data", logVOS);
        return map;
    }
}
