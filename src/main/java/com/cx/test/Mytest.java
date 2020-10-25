package com.cx.test;

import com.cx.bean.User;
import com.cx.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author cx
 * @create 2020-10-24 22:37
 */
public class Mytest {
    @Autowired
    static UserDao userDao;
    public static void main(String[] args) {
        User userById = userDao.getUserById(1);
        System.out.println(userById);
    }
}
