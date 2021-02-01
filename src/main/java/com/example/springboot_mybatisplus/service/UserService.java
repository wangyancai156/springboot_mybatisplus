package com.example.springboot_mybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot_mybatisplus.entity.User;
import com.example.springboot_mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: LiuRunYong
 * @Date: 2020/4/22
 **/
/**
 * @Description:
 * @Author: LiuRunYong
 * @Date: 2020/4/22
 **/

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> selectALlUserList() {
        return userMapper.selectList(new QueryWrapper<>());
    }

    public  User getUserByid() {
        return userMapper.selectById(1);
    }
}