package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by qiao on 2018/7/2.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public User queryOne(int id) {
        return userDao.selectOne(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<User> queryAll() {
        System.out.println("bbbbbbbbbb");
        return userDao.selectAll();
    }
}
