package com.alva.arbook.annotation;


import com.alva.arbook.parser.DefaultContentParse;
import com.alva.arbook.service.SysUserTService;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Modify {
    /**
     * 日志的中文描述信息
     *
     * @return
     */
    String description() default "";

    /**
     * 获取编辑信息的解析类，目前为使用id获取，复杂的解析需要自己实现，默认不填写
     * 则使用默认解析类
     *
     * @return
     */
    Class parseclass() default DefaultContentParse.class;

    /**
     * 查询数据库所调用的service
     *
     * @return
     */
    Class serviceclass() default SysUserTService.class;

    /**
     * 前台字段名称
     */
    String[] feildName() default {"id"};

    /**
     * 具体业务操作名称
     */
    String handleName() default "";
}
