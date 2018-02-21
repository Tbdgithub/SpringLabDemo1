package com.example.demo.mapperxml;


import com.example.demo.entity.UserEntity;

import java.util.List;

//@Mapper
public interface UserMapperWithXml {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
