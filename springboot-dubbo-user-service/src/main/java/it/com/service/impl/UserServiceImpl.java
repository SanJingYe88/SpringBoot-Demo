package it.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;

import it.com.service.UserService;

@Service // 使用的是 dubbo 提供的 @Service 注解
public class UserServiceImpl implements UserService {

	@Override
	public List<String> getUsersName() {
		List<String> demo = new ArrayList<String>();
		demo.add("AAA");
		demo.add("BBB");
		demo.add("CCC");
		return demo;
	}
}
