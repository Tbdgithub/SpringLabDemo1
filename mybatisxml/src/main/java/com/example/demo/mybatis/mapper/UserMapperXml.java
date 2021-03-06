package com.example.demo.mybatis.mapper;

import com.example.demo.mybatis.entity.UserEntity;

import java.util.List;


public interface UserMapperXml {
	
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}