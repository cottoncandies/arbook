package com.alva.arbook.service;

import com.alva.arbook.dto.UserDTO;
import com.alva.arbook.entity.SysUserT;

public interface SysUserTService {
    SysUserT login(UserDTO userDTO);
}
