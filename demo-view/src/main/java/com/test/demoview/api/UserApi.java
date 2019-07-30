package com.test.demoview.api;

import com.test.democommon.request.UserRequest;
import com.test.democommon.result.Result;
import com.test.demodata.entity.User;
import com.test.demoservice.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Resource
    private UserService mUserService;

    @PostMapping(value = "/register")
    public Result register(UserRequest.RegisterParam param) {
        User user = new User();
        user.setUsername(param.getUsername());
        user.setNickname(param.getNickname());
        user.setGender(param.getGender());
        return mUserService.createUser(user);
    }

    @GetMapping(value = "/searchUser/{username}")
    public Result searchUserByUsername(@PathVariable String username) {
        return mUserService.getUserInfoByUsername(username);
    }
}
