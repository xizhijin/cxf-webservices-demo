package com.demo.service.impl;

import javax.jws.WebService;

import com.demo.service.HelloWorldService;

@WebService(endpointInterface = "com.demo.service.HelloWorldService", serviceName = "helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String sayHi(String text) {
		return "Hi, " + text;
	}

}
