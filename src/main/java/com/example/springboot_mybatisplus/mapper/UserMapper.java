package com.example.springboot_mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_mybatisplus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: LiuRunYong
 * @Date: 2020/4/22
 **/
@Repository
public interface UserMapper extends BaseMapper<User> {

}