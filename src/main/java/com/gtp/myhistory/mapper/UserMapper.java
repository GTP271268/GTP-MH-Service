package com.gtp.myhistory.mapper;

import com.gtp.myhistory.been.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> getUser();

    @Insert("insert into user values(null,#{name},#{password})")
    void insertUser(@Param("name") String name,@Param("password") String password);

}
