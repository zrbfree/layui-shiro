package com.rick.config;

/**
 * Desc :  tk mybaits
 * User : RICK 
 * Time : 2017/9/7 16:05
  */
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}

