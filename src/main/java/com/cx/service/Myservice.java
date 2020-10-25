package com.cx.service;

import com.cx.bean.User;
import com.cx.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author cx
 * @create 2020-10-24 23:16
 */
@Service
public class Myservice {
    @Autowired
    UserDao userDao;
    public User SelectUser(){
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        User userById = mapper.getUserById(1);
//        System.out.println("----------------userBtID------------------------------!!!!!!!!!!!!!!!!!!!");
//        System.out.println(userById);
        User userById = userDao.getUserById(1);
        System.out.println(userById);
        return userById;
    }
    public List<User> UserList(){
        List<User> users = userDao.UserList();
        return users;
    }

}
