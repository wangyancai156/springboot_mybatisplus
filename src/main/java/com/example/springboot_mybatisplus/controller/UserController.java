package com.example.springboot_mybatisplus.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot_mybatisplus.service.UserService;

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

    @GetMapping("user")
    public Map<String, Object> getUserById() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("data", userService.getUserByid());
        result.put("msg", "success");
        return result;
    }
}