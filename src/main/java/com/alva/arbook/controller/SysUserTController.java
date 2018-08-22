package com.alva.arbook.controller;

import com.alva.arbook.dto.UserDTO;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysUserTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SysUserTController {

    @Autowired
    private SysUserTService sysUserTService;

    @Value("${sessionLoginUser}")
    private String sessionLoginUser;

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(UserDTO userDTO, HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            SysUserT loginUser = sysUserTService.login(userDTO);
            session.setAttribute(sessionLoginUser, loginUser);
            result.put("success", true);
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", e.getMessage());
        }

        return result;
    }

    @RequestMapping("/exit")
    public String exit(HttpSession session) {
        session.removeAttribute(sessionLoginUser);
        session.invalidate();
        return "redirect:/login.html";
    }
}
