package Assesment_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMax {

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
    int min = l.get(0);
    int max = l.get(0);

    for (int e : l) {
      if (e < min) {
        min = e;
      }
      if (e > max) {
        max = e;
      }
    }

    System.out.println("Minimum element: " + min);
    System.out.println("Maximum element: " + max);
  }
}
