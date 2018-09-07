package com.honeypot.honeypot.controller;

import com.honeypot.honeypot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin     //支持跨域请求，但是method一定得对应
@RequestMapping(value = "/honeycontrol")
public class HoneyControlController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/queryuser",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryUserList(){

        return null;
    }
}
