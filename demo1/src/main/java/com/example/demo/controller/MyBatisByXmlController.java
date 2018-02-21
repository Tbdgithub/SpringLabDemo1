package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapperxml.UserMapperWithXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MyBatisByXmlController {

    @Autowired
    private UserMapperWithXml userMapper;

    @RequestMapping("/getUsers_xmlmapping")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser_xmlmapping")
    public UserEntity getUser(Long id) {
        UserEntity user=userMapper.getOne(id);
        return user;
    }



}
