package com.test.demoservice;

import com.test.democommon.result.Result;
import com.test.demodata.entity.User;

public interface UserService {

    /*
    创建User对象
     */
    Result createUser(User user);

    /*
    根据用户名获取User
     */
    Result<User> getUserInfoByUsername(String username);
}
