package com.test.demodata.repository;

import com.test.demodata.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    //通过用户名查找User
    User findUserByUsername(String username);
}
