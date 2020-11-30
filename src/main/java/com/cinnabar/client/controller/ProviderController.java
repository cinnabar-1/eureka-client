package com.cinnabar.client.controller;

import com.cinnabar.client.beans.User;
import com.cinnabar.client.config.Logback;
import com.cinnabar.client.config.authToken.AuthToken;
import com.cinnabar.client.config.handelResponse.RespEntity;
import com.cinnabar.client.config.handelResponse.ResponseCtrl;
import com.cinnabar.client.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/user")
@AuthToken
public class ProviderController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    Logback logback;

    @ApiOperation(value = "return a url parameter")
    @RequestMapping(value = "/{name}", method = RequestMethod.POST)
    public RespEntity findName(@PathVariable("name") String name, @RequestParam("age") Integer age, @RequestParam("account") String acccount, @RequestBody User user) {
        return ResponseCtrl.in((result) -> {
            System.out.println(logback);
            if("test".equals(name)){

            }
            if ("zhuzhao".equals(name)) {
                throw new Exception("can can can" + age);
            } else {
                User user1 = userMapper.getByUserAccount(user.getAccount());
                result.setData(user1);
            }
        });
    }

    @ApiOperation(value = "test")
    @RequestMapping(value = "/{account}", method = RequestMethod.GET)
    public RespEntity test(@PathVariable("account") String account, @RequestParam("age") Integer age) {
        return ResponseCtrl.in((result) -> result.setData(userMapper.test(account)));
    }

}