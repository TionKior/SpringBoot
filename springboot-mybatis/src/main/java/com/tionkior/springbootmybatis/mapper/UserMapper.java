package com.tionkior.springbootmybatis.mapper;

import com.tionkior.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    List<User> findAll();


}
