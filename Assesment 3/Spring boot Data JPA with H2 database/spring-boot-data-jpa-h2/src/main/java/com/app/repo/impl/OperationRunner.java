package com.app.repo.impl;
import java.util.Optional;
import java.util.Scanner;

//import org.examples.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class OperationRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	
	public void run(String...args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose a value");
		int x = sc.nextInt();
		
		
		switch(x)
		{
		case 1:
			System.out.println("enter the details to insert the row");
			
			System.out.println("===================================");
			System.out.print("Enter the prod name: ");
			String prod = sc.next();
			System.out.print("enter the ver: ");
			float ver = sc.nextFloat();
			System.out.print(" enter color");
			String col = sc.next();
			repo.save(new Product(prod,ver,col));
			System.out.println("Row Inserted Successfully" );
			
			
			
		case 2:
		{
			System.out.println("printing the table");
			
			System.out.println("===================================");
			repo.findAll().forEach((System.out::println));
			
			break;
		}
		
		case 3:
		{
			break;
		}
			
			
		}
		
		//insert operation
		/*1.***************SAVE****************/
//		repo.save(new Product("mic",6.8,"Blue"));
//		repo.save(new Product("mic1",50000.90,"Black"));
//		repo.save(new Product("mic2",75000.00,"Grey"));
//		
//		//2 find operations
//		Optional <Product> p = repo.findById(5);
//		if(p.isPresent())
//		{
//			System.out.println(p.get());
//		}
//		else {
//			System.out.println("No Data foound");
//		}
//		//see all the rows of the table.
//		repo.findAll().forEach((System.out::println));
	}

}