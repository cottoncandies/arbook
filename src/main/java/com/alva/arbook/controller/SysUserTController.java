package com.alva.arbook.controller;

import com.alva.arbook.annotation.Modify;
import com.alva.arbook.dto.UserDTO;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysUserTService;
import com.alva.arbook.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
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

    @RequestMapping("/getusers")
    @ResponseBody
    public Map getusers(int page, int limit) {
        HashMap<String, Object> map = new HashMap<>();
        List<UserVO> userVOS = sysUserTService.selectAll(page, limit);
        map.put("code", 0);//查询状态
        map.put("msg", "成功");//消息提示
        map.put("count", sysUserTService.selectAllCount());//查询总数
        map.put("data", userVOS);
        return map;
    }

    @Modify(description = "删除", serviceclass = SysUserTService.class, handleName = "删除用户信息")
    @RequestMapping("/deleteuser")
    @ResponseBody
    public void deleteuser(String id) {
        sysUserTService.deleteByPrimaryKey(id);
    }

    @Modify(description = "新建", serviceclass = SysUserTService.class, handleName = "新建用户")
    @RequestMapping("/adduser")
    @ResponseBody
    public Map adduser(UserDTO userDTO) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            sysUserTService.insert(userDTO);
            map.put("success", true);
        } catch (Exception e) {
            map.put("success", false);
        }
        return map;
    }

    @Modify(description = "编辑", serviceclass = SysUserTService.class, handleName = "更改用户信息")
    @RequestMapping("/editUser")
    @ResponseBody
    public Map updateuser(UserVO userVO) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            sysUserTService.updateByPrimaryKey(userVO);
            map.put("success", true);
        } catch (Exception e) {
            map.put("success", false);
        }
        return map;
    }

    @RequestMapping("/checkemail")
    @ResponseBody
    public Map checkemail(String email) {
        HashMap<String, Object> map = new HashMap<>();
        if (sysUserTService.selectByEmail(email) != null) {
            map.put("success", true);
        } else {
            map.put("success", false);
        }
        return map;
    }

    @RequestMapping("/checkphone")
    @ResponseBody
    public Map checkphone(String phone) {
        HashMap<String, Object> map = new HashMap<>();
        if (sysUserTService.selectByPhone(phone) != null) {
            map.put("success", true);
        } else {
            map.put("success", false);
        }
        return map;
    }

    //@Log(description = "安全退出")
    @RequestMapping("/exit")
    public String exit(HttpSession session) {
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/login.html";
    }
}
