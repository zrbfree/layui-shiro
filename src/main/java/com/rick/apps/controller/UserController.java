package com.rick.apps.controller;

import com.rick.apps.service.IUserService;
import com.rick.common.ResultJson;
import com.rick.generator.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ResultJson index(String userName){
        System.out.println("===========");
        User user = userService.selectByUserName(userName);
        if(user != null){
            return ResultJson.buildSuccessInstance(user);
        } else{
            return ResultJson.buildFailInstance("查询当前用户信息失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/saveUser", method = RequestMethod.GET)
    public ResultJson saveUser(User user) throws Exception{

        int saveNum = userService.save(user);

        System.out.println("saveNum----->" + saveNum);
        return ResultJson.buildSuccessInstance();
    }
}
