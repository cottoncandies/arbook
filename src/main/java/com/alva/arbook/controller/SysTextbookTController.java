package com.alva.arbook.controller;

import com.alva.arbook.service.AppKeyTService;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.vo.TextBookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ApiV1")
public class SysTextbookTController {

    @Autowired
    private SysTextbookTService sysTextbookTService;

    @Autowired
    private AppKeyTService appKeyTService;


    //String ak,授权Key
    // String sub,学科
    // String pub,出版社
    // String s,学段：小学，初中，高中
    // String g,年级
    // int p, 页码
    // int sz 分页大小

    @RequestMapping("/GetIndex")
    @ResponseBody
    public Map GetIndex(String ak, String sub, String pub, String s, String g, int p, int sz) {

        Map<String, Object> map = new HashMap<>();

        //判断授权Key是否合法
        if (appKeyTService.selectByAccessKey(ak) != null) {
            List<TextBookVO> textBookVOList = sysTextbookTService.selectByCustom(sub, pub, s, g, p, sz);

            map.put("result", 0);
            map.put("message", "提交成功");
            map.put("total", sysTextbookTService.count(sub, pub, s, g));
            map.put("length", textBookVOList.size());
            map.put("data", textBookVOList);
        } else {
            map.put("result", -1);
            map.put("message", "提交失败");
        }
        return map;
    }
}