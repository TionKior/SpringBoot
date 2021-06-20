package com.tionkior.springbootmybatis.mapper;

import com.tionkior.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserXmlMapper {

    List<User> findAll();

}
