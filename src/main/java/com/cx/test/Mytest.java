package com.cx.test;

import com.cx.bean.User;
import com.cx.dao.UserDao;
import com.cx.service.Myservice;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author cx
 * @create 2020-10-24 22:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Mytest {
    @Autowired
    Myservice myservice;
    @Test
    public void hello(){
        User user = myservice.SelectUser();
        System.out.println(user);
    }
}
