package com.alva.arbook.service;

import com.alva.arbook.entity.SysUserT;

public interface SysUserTService {
    SysUserT login(String email, String password);
}
