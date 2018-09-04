package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysLogTMapper;
import com.alva.arbook.entity.SysLogT;
import com.alva.arbook.service.SysLogTService;
import com.alva.arbook.vo.LogVO;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SysLogTServiceImpl implements SysLogTService {

    @Resource
    private SysLogTMapper sysLogTMapper;

    @Resource
    private DozerBeanMapper mapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    public int insert(SysLogT record) {
        return sysLogTMapper.insert(record);
    }

    @Override
    public SysLogT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<LogVO> selectAll() {
        ArrayList<LogVO> logVOS = new ArrayList<>();
        List<SysLogT> sysLogTS = sysLogTMapper.selectAll();
        for (SysLogT sysLogT : sysLogTS) {
            LogVO logVO = mapper.map(sysLogT, LogVO.class);
            logVOS.add(logVO);
        }
        return logVOS;
    }

    @Override
    public int updateByPrimaryKey(SysLogT record) {
        return 0;
    }

    @Override
    public List<LogVO> selectAllByPage(Integer page, Integer limit, String type) {
        ArrayList<LogVO> logVOS = new ArrayList<>();
        List<SysLogT> sysLogTS = sysLogTMapper.selectAllByPage((page - 1) * limit, limit, type);
        for (SysLogT sysLogT : sysLogTS) {
            LogVO logVO = mapper.map(sysLogT, LogVO.class);
            logVOS.add(logVO);
        }
        return logVOS;
    }
}
