package techy;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int r = 0;
	        while (n != 0) {
	            int digit = n % 10;
	            r = r * 10 + digit;
	            n /= 10;
	        }
	        System.out.println(r);
	}
}
