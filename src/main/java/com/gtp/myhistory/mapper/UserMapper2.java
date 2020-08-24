package com.gtp.myhistory.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.gtp.myhistory.been.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository //加这个@Autowired不会变红报错
public interface UserMapper2 extends BaseMapper<User> {
    @Select("select * from user")
    List<User> selectAll();//注解方式
    @Update("update user set ${ew.sqlSet} ${ew.customSqlSegment}")
    int upateUser(@Param(Constants.WRAPPER) UpdateWrapper<User> ew);

    List<User> selectAll2();//以下方法均为配置方式,配置文件路径resources/mapper下

    User findUserById(@Param("id") Integer id);

    List<User> selectUsers(@Param(Constants.WRAPPER) Wrapper<User> queryWrapper);
}
