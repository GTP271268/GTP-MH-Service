package com.gtp.myhistory.service;

import com.gtp.myhistory.been.User;
import com.gtp.myhistory.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoDao demoDao;

    @Override
    public List<User> test() {

        return demoDao.test();

    }
}
