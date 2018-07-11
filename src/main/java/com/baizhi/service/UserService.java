package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by qiao on 2018/7/2.
 */
public interface UserService {
    public User queryOne(int id);

    List<User> queryAll();
}
