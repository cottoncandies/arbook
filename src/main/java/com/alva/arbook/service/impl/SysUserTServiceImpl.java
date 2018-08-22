package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysUserTMapper;
import com.alva.arbook.dto.UserDTO;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysUserTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserTServiceImpl implements SysUserTService {
    @Resource
    private SysUserTMapper sysUserTMapper;

    @Override
    public SysUserT login(UserDTO userDTO) {
        try {
            SysUserT sysUserT = sysUserTMapper.selectByEmail(userDTO.getEmail());
            if (sysUserT == null) throw new RuntimeException("用户名不存在");
            if (!sysUserT.getSzPassword().equals(userDTO.getPassword())) throw new RuntimeException("密码错误");
            return sysUserT;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
