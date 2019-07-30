package com.test.demodata.entity;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //用户名，由系统生成
    @Column(nullable = false, length = 20)
    private String username;

    //昵称
    @Column(length = 20)
    private String nickname;

    //性别，1 男 ， 2 女 , 0 未知
    @Column(columnDefinition = "tinyint(1) default 0", length = 1)
    private int gender;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
