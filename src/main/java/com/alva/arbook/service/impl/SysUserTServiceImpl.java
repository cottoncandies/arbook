package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysUserTMapper;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysUserTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserTServiceImpl implements SysUserTService {
    @Resource
    private SysUserTMapper sysUserTMapper;

    @Override
    public SysUserT login(String email, String password) {
        try {
            SysUserT sysUserT = sysUserTMapper.selectByEmail(email);
            if (sysUserT == null) throw new RuntimeException("用户名不存在");
            if (!sysUserT.getSzPassword().equals(password)) throw new RuntimeException("密码错误");
            return sysUserT;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
