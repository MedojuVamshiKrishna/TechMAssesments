package Assesment_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class upr {

  public static void main(String[] args) {
    List<String> l = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of N: ");
    int n = sc.nextInt();
    for(int i=0;i<n;i++)
    {
    	String temp = sc.next();
    	l.add(temp);
    }
    List<String> uppercaseColors = l.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

    System.out.println("Uppercase colors: " + uppercaseColors);

    
  }
}
