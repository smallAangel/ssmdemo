package com.cx.bean;

import java.io.Serializable;

/**
 * @author cx
 * @create 2020-10-24 22:42
 */
public class User implements Serializable {
    private static final long serialVersionUID = -684979447710L;
    Integer id;
    String name;
    String pwd;

    public User() {
    }

    public User(Integer id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

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

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
