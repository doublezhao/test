package com.example.test.mapper;

import com.example.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author kzhao
 * @Date 10/21/2019 3:09 PM
 **/
@Repository
public interface UserMapper {
     User Sel(int id);
}
