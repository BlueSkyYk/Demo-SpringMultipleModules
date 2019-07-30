package com.test.demoservice;

import com.test.democommon.result.Result;
import com.test.demodata.entity.User;
import com.test.demodata.repository.UserRepository;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository mUserRepository;


    @Transient
    @Override
    public Result createUser(User user) {
        try {
            User u = mUserRepository.save(user);
            return new Result(200, true, "创建用户成功", u);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1001, false, "创建用户失败", null);
        }
    }

    @Override
    public Result<User> getUserInfoByUsername(String username) {
        try {
            User user = mUserRepository.findUserByUsername(username);
            if (user != null) {
                return new Result(200, true, "获取用户成功", user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(1002, false, "获取用户信息失败", null);
    }
}
