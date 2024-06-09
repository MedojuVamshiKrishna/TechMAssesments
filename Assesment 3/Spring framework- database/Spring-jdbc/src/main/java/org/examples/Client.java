package org.examples;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String args[]) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	Scanner sc = new Scanner(System.in);
	EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
	
	int x = sc.nextInt();
	
	
	switch(x)
	{
	case 1:
		System.out.println("enter the details to insert the row");
		
		System.out.println("===================================");
		System.out.print("Enter the id value: ");
		int id = sc.nextInt();
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print(" enter salary");
		int sal = sc.nextInt();
		int status=dao.saveEmployee(new Employee(id,name,sal));
		System.out.println("Row Inserted Successfully" +status);
		break;
		
	case 2:
	{
		System.out.println("enter the details to delete the row");
		
		System.out.println("===================================");
		System.out.print("Enter the id value: ");
		int id1 = sc.nextInt();
		Employee e=new Employee();
		e.setId(id1);
		int status1=dao.deleteEmployee(e);
		System.out.println(status1);
		break;
	}
	case 3:
	{
		dao.viewEmployee();
	}
		
	case 4:
	{
		break;
	}
		
		
	}
	
	
	
	
	/*int status=dao.updateEmployee(new Employee(102,"Rajan",15000));
	System.out.println(status);
	*/
	
  }
}