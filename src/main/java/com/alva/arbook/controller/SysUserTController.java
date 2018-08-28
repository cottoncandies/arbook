package com.alva.arbook.controller;

import com.alva.arbook.annotation.LogAnnotation;
import com.alva.arbook.dto.UserDTO;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysUserTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SysUserTController {

    @Autowired
    private SysUserTService sysUserTService;

    @RequestMapping("/login")
    @ResponseBody
    public Map login(UserDTO userDTO, HttpSession session) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            SysUserT sysUserT = sysUserTService.login(userDTO);
            session.setAttribute("user", sysUserT);
            map.put("success", true);
        } catch (Exception e) {
            map.put("success", false);
            map.put("message", e.getMessage());
        }
        return map;
    }

    @LogAnnotation(description = "安全退出")
    @RequestMapping("/exit")
    public String exit(HttpSession session) {
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/login.html";
    }
}
