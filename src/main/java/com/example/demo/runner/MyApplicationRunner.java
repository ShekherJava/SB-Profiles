package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bean.ProfileBean;

@Component
public class MyApplicationRunner implements ApplicationRunner {
	
	@Autowired
	ProfileBean profileBean;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("id   : " + profileBean.getProfileId());
		System.out.println("Name : " + profileBean.getProfileName());
	}

}
