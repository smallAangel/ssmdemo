package com.cx.controller;

import com.cx.bean.User;
import com.cx.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author cx
 * @create 2020-10-24 22:22
 */
@Controller
public class MyController {
    @Autowired
    Myservice myservice;
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        List<User> users = myservice.UserList();
        map.put("Users",users);
        return "list";
    }
}
