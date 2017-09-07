package com.rick.apps.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc :  通用接口
 * User : RICK
 * Time : 2017/9/7 16:35
  */
@Service
public interface IBaseService<T> {
    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

    //TODO 其他...

}
