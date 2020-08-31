package com.gtp.myhistory.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.gtp.myhistory.been.UserTest;
import com.gtp.myhistory.been.UserTest;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository //加这个@Autowired不会变红报错
public interface UserMapper2 extends BaseMapper<UserTest> {
    @Select("select * from user")
    List<UserTest> selectAll();//注解方式
    @Update("update user set ${ew.sqlSet} ${ew.customSqlSegment}")
    int upateUser(@Param(Constants.WRAPPER) UpdateWrapper<UserTest> ew);

    List<UserTest> selectAll2();//以下方法均为配置方式,配置文件路径resources/mapper下

    UserTest findUserById(@Param("id") Integer id);

    List<UserTest> selectUsers(@Param(Constants.WRAPPER) Wrapper<UserTest> queryWrapper);
}
