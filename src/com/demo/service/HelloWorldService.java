package com.demo.service;

import javax.jws.WebService;

@WebService
public interface HelloWorldService {
	
	public String sayHi(String text);
}
