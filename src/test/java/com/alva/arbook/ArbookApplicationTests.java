package com.alva.arbook;

import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.dto.UserDTO;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.vo.TextbookVO;
import org.dozer.DozerBeanMapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArbookApplicationTests {

    @Resource
    private SysTextbookTMapper sysTextbookTMapper;

    @Resource
    private DozerBeanMapper mapper;

    @Test

    public void contextLoads() throws Exception {
        // 测试dozer
//        SysTextbookT sysTextbookT = sysTextbookTMapper.selectByPrimaryKey("1");
//        TextbookVO textbookVO = mapper.map(sysTextbookT, TextbookVO.class);
//        System.out.println(textbookVO);


        UserDTO userDTO = new UserDTO();
        userDTO.setEmail("111");
        userDTO.setPassword("222");
        System.out.println(userDTO);
        SysUserT map = mapper.map(userDTO, SysUserT.class);
        System.out.println(map);
    }
}



