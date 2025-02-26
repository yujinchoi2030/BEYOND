package com.beyond.restapi.auth.model.mapper;

import com.beyond.restapi.auth.model.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthMapper
{
    User selectUserById(@Param("id") String id);
}
