package com.cinnabar.client.mapper;

import com.cinnabar.client.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author cinnabar-1
 * @version 1.0.0
 * @ClassName UserMapper.java
 * @Description
 * @createTime 2020-11-24  17:53:00
 */
@Mapper
@Component(value = "UserMapper")
public interface UserMapper {
//    @Select("select * from user_info where account=#{account}")
    User getByUserAccount(@Param("account") String account);

    String test(String account);
}
