package com.gtp.myhistory.controller;


import com.gtp.myhistory.been.UserTest;
import com.gtp.myhistory.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *Created by gtp on 2020/4/22
 */
//@Controller  //返回页面，用它下面每个方法就要@ResponseBody，而@RestController不用
@RestController //以json数据返回，相比@Controller 自带@ResponseBody
@RequestMapping("/mh")//上面只有@RequestMapping能用，下面方法上还能用@GetMapping与@PostMapping对应get与post请求
public class DemoController {
	@Autowired
	DemoService demoService;
	//@RequestMapping(name = "hello")
	@RequestMapping("/test1")
//	@PostMapping("/test")
//	@ResponseBody
	public Object test() {
		//List<User> list= demoService.test();
		//return list;
		return "hello ,spring boot!!";
	}

	@RequestMapping("/test2")
//	@ResponseBody
	public Object test2() {
         int a=2/0;
		return "hello ,spring boot2!!";
	}

	@RequestMapping("/test3")
	public String test3() {

		return "index";
	}


}


