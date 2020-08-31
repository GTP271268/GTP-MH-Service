package com.gtp.myhistory.service;

import com.gtp.myhistory.been.UserTest;
import com.gtp.myhistory.dao.DemoDao;
import com.gtp.myhistory.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserTest> test() {

        //return demoDao.test();
        return null;
    }
}
