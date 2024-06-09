package Assesment_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayToCollection {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] a = new int[n];
	
	for(int i=0;i<n;i++)
	{
		
		a[i] = sc.nextInt() ;
	}
    Collection<Integer> c = new ArrayList<>();

    for (int arr : a)
    {
    	c.add(arr);
    }

    System.out.println("Collection: " + c);
  }
}