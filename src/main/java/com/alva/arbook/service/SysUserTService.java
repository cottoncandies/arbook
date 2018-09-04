package com.alva.arbook.service;

import com.alva.arbook.dto.UserDTO;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.vo.UserVO;

import java.util.List;

public interface SysUserTService extends BaseService<SysUserT> {

    SysUserT login(UserDTO userDTO);

    int deleteByPrimaryKey(String szId);

    int insert(UserDTO record);

    //SysUserT selectByPrimaryKey(Integer szId);

    List<UserVO> selectAll(int page,int limit);

    int updateByPrimaryKey(UserVO record);

    Long selectAllCount();

    SysUserT selectByEmail(String email);

    SysUserT selectByPhone(String phone);

}
