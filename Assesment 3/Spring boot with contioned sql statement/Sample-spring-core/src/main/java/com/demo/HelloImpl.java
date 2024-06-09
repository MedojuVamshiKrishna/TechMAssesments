package com.demo;
//Business Logic
//Bean Component
public class HelloImpl implements Hello {
	private String greeting;
	
	//default constructor
	public HelloImpl() {}
	
	//parameterized Constructor
	public HelloImpl(String a) {
		greeting=a;
	}
	
	public String sayHello(String s) {
		return greeting+s;
		
	}
	public void setgreeting(String a) {
		greeting=a;
	}

}
