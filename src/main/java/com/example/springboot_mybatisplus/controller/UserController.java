package com.example.springboot_mybatisplus.controller;

import com.example.springboot_mybatisplus.entity.User;
import com.example.springboot_mybatisplus.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/user/")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("hello")
    public String hello() {
        return "hello word!";
    }

    @GetMapping("list")
    public Map<String, Object> listAll() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("data", userService.selectALlUserList());
        result.put("msg", "success");
        return result;

    }
}