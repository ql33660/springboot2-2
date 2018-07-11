package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by qiao on 2018/7/2.
 */
public interface UserDao {
    public User selectOne(int id);

    List<User> selectAll();
}
