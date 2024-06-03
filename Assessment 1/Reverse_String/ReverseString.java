package techy;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print( Character.toLowerCase(ch));
            }
            else {
            	System.out.print(ch);
            }
            
        }
       
	}
}
