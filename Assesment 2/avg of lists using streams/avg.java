package Assesment_2;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class avg {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of N: ");
    int n = sc.nextInt();
    for(int i=0;i<n;i++)
    {
    	int temp = sc.nextInt();
    	l.add(temp);
    }
   
    OptionalDouble average = l.stream()
        .mapToDouble(Integer::doubleValue) 
        .average();

   
    if (average.isPresent()) {
      System.out.println("Average of the list: " + average.getAsDouble());
    } else {
      System.out.println("List is empty. Average cannot be calculated.");
    }
  }
}