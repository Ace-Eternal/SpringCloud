package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.jws.soap.SOAPBinding;

@Mapper
public interface UserMapper {
    User findUserByUid(int uid);
}
