package com.gtp.myhistory.controller;


import com.gtp.myhistory.been.User;
import com.gtp.myhistory.mapper.UserMapper;
import com.gtp.myhistory.service.DemoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gtp on 2020/4/22
 */
@Controller
@RequestMapping("/tl")
public class PageController {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/index")
	@ApiOperation(value = "test", notes = "test")
	public Object test(Model model) {
		List<String> list =new ArrayList<>();
		list.add("111");
		list.add("222");
		list.add("333");
        model.addAttribute("name","gtp");
        model.addAttribute("list",list);
		model.addAttribute("mobile","13500000000");

		return "index"; //thymeleaf测试，文件resoursece/templates/index.html
	}


	@RequestMapping("/getuser")
	@ResponseBody
	public Object test2(Model model) {
		List<User> list=userMapper.getUser();
		return list;
	}

	@RequestMapping("/insert")
	@ResponseBody
	public Object test3(String name,String password) {
		userMapper.insertUser(name,password);
		return "insert ok";
	}
}


