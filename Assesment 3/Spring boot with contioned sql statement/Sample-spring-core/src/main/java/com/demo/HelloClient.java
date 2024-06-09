package com.demo;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;


public class HelloClient {
public static void main(String args[]) throws Exception {
	try
	{
		System.out.println("Please Wait...");
		//load the xml file into client application by searching its resource.
		Resource res = new ClassPathResource("config.xml");
		//used to read the contents (tags) in xml file
		BeanFactory factory = new XmlBeanFactory(res);
		//then the client application gets the bean
		Hello bean1= (Hello)factory.getBean("sample");
		String s=  bean1.sayHello("vamc");
		System.out.println(s);
	}
	catch(Exception ex) {
		//ex.printStackTrace();
		System.out.println("Exception " + ex);
	}
	
}
}
