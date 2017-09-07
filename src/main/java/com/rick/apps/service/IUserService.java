package com.rick.apps.service;

import com.rick.generator.entity.User;

public interface IUserService extends IBaseService<User>{

    User selectByUserName(String userName);

}
