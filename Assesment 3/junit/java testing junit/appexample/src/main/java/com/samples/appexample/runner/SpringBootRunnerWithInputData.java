package com.samples.appexample.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class SpringBootRunnerWithInputData implements CommandLineRunner {
	
	@Value("${my.info.student.id}")
	private int rollno;
	
	@Value("${my.info.student.name}")
	private String name;
	
	@Value("${my.info.student.year}")
	private int year;
	
	@Value("${my.info.student.passed}")
	private boolean passed;
	

	
	//instead of setter getter methods
	//let us print using toString
	@Override
	public String toString() {
		return "SpringBootRunnerWithInputData [Rollno=" + rollno + ",name=" + name + ",year=" + year + ",ispasses=" + passed +"]";
	}
	
	//override the run method
	public void run(String...args) throws Exception {
		System.out.println(this);
	}
	
	


}
