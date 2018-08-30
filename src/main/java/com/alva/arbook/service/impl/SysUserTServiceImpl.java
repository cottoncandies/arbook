package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysUserTMapper;
import com.alva.arbook.dto.UserDTO;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysUserTService;
import com.alva.arbook.util.UUIDUtils;
import com.alva.arbook.vo.UserVO;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SysUserTServiceImpl implements SysUserTService {
    @Resource
    private SysUserTMapper sysUserTMapper;

    @Resource
    private DozerBeanMapper mapper;

    @Override
    public SysUserT login(UserDTO userDTO) {
        try {
            SysUserT sysUserT = sysUserTMapper.selectByEmail(userDTO.getEmail());
            if (sysUserT == null) throw new RuntimeException("用户名不存在!");
            if (sysUserT.getNtRowState() != 1) throw new RuntimeException("此账号被冻结！");
            if (!sysUserT.getSzPassword().equals(userDTO.getPassword())) throw new RuntimeException("密码错误");
            return sysUserT;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int deleteByPrimaryKey(String szId) {
        return sysUserTMapper.deleteByPrimaryKey(szId);
    }

    @Override
    public int insert(UserDTO record) {
        SysUserT sysUserT = mapper.map(record, SysUserT.class);
        sysUserT.setSzId(UUIDUtils.createUUID());
        return sysUserTMapper.insert(sysUserT);
    }

    @Override
    public SysUserT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<UserVO> selectAll(int page,int limit) {
        List<SysUserT> sysUserTS = sysUserTMapper.selectAll((page-1)*limit,limit);
        List<UserVO> userVOS = new ArrayList<>();
        for (SysUserT sysUserT : sysUserTS) {
            UserVO userVO = mapper.map(sysUserT, UserVO.class);
            userVOS.add(userVO);
        }
        return userVOS;
    }

    @Override
    public int updateByPrimaryKey(UserVO record) {
        SysUserT sysUserT = mapper.map(record, SysUserT.class);
        return sysUserTMapper.updateByPrimaryKey(sysUserT);
    }

    @Override
    public Long selectAllCount() {
        return sysUserTMapper.selectAllCount();
    }

    @Override
    public SysUserT selectByEmail(String email) {
        return sysUserTMapper.selectByEmail(email);
    }

    @Override
    public SysUserT selectByPhone(String phone) {
        return sysUserTMapper.selectByPhone(phone);
    }
}
