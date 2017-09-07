package com.rick.apps.service.impl;

import com.rick.apps.service.IUserService;
import com.rick.generator.entity.User;
import com.rick.generator.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUserName(String userName) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName", userName);
        List<User> userList = userMapper.selectByExample(example);
        User user = null;
        if(userList != null && userList.size() > 0){
            user = userList.get(0);
        }
        return user;
    }
}
