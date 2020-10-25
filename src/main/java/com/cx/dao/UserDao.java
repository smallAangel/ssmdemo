package com.cx.dao;

import com.cx.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cx
 * @create 2020-10-24 22:41
 */
public interface UserDao {
    public User getUserById(Integer id);
    public List<User> UserList();
}

