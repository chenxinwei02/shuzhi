package com.swp.mapper;

import com.swp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: Way
 * description
 * date 2024/6/29 21:30
 */
@Mapper
public interface UserMapper {
    @Select("select  * from users where username=#{username}")
    User findByUsername(String username);
}
