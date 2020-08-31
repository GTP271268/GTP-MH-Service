package com.gtp.myhistory.dao;

import com.gtp.myhistory.been.UserTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DemoDao {

    //List<User> test(@Param("id") int id);
    List<UserTest> test();
}
