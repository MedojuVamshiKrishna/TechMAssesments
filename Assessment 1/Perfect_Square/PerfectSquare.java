package techy;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        
        int sqrt = (int) Math.sqrt(num);
        boolean isPerfectSquare= sqrt * sqrt == num;
        System.out.println(isPerfectSquare);

        scanner.close();
	}
}
