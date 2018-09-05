package it.com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import it.com.service.UserService;

@Controller
public class UserController {

	@Reference		//使用dubbo的@Reference注解
	private UserService userService;
	
	@RequestMapping("all")
	@ResponseBody
	public List<String> getAll(){
		return userService.getUsersName();
	}
}
