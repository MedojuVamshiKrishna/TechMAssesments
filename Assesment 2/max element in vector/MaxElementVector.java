package Assesment_2;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class MaxElementVector {
	public static void main(String[] args) {
	    Vector<Integer> v = new Vector<>();
	    Scanner sc = new Scanner(System.in);
	    System.out.print("enter the value of N: ");
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	    	int temp = sc.nextInt();
	    	v.add(temp);
	    }

	    System.out.println("Maximum element in Vector: " + Collections.max(v));
	  }
}
