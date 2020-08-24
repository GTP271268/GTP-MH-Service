package com.gtp.myhistory.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.gtp.myhistory.been.JsonDate;
import com.gtp.myhistory.been.ResponseJson;
import com.gtp.myhistory.been.Role;
import com.gtp.myhistory.been.User;
import com.gtp.myhistory.mapper.UserMapper;
import com.gtp.myhistory.mapper.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gtp on 2020/4/22
 */
@RestController
@RequestMapping("/user1")
public class UserController {
	@Autowired
	UserMapper2 userMapper2;
	@Autowired
	UserMapper userMapper;
//	@RequestMapping("/test1")
	@PostMapping("/test1")
	public Object test1(JsonDate o) {
		Object O=o;
		Role r=new Role();//lombok测试
		r.setId(1);
		r.getId();
//		List<User> l=userMapper.getUser();
//		User u1=userMapper2.selectById(1);
//		int a=userMapper2.upateUser(new UpdateWrapper<User>().set("name", "C").eq("id", 1));
//		List<User> u2=userMapper2.selectAll2();
//		User u3 =userMapper2.findUserById(1);
		List<User> list = userMapper2.selectUsers(new QueryWrapper<User>().eq("name", "C"));
		return list;
	}

	@PostMapping("/test2")
	public User test2(@RequestBody @Valid User user) {
//		{"id": 1, "name": "gtp", "password": "123456" }
      String s=user.toString();

		return user;
	}

	@PostMapping("/test3")
	public void test3(@RequestBody @Valid List<ResponseJson> responseJsonList) {
        List<ResponseJson> s=responseJsonList;

		//return "外部接口调用成功";
	}


}


