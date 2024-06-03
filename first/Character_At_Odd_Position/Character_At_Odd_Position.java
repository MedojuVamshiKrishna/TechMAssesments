package techy;

import java.util.Iterator;
import java.util.Scanner;

public class Character_At_Odd_Position {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		System.out.println(str);
		for( int i=1; i<str.length();i+=2)
		{
			System.out.print(str.charAt(i));
		}
//		System.out.println("heroo");
	}
}
