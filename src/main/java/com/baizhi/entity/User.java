package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * Created by qiao on 2018/7/2.
 */
public class User implements Serializable {
    @JSONField(serialize = false)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
        super();
    }
}
