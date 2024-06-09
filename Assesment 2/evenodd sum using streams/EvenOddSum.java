package Assesment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EvenOddSum {
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

        int sumOfEvenNumbers = l.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOfOddNumbers = l.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
    }
}

  
