package techy;

import java.util.Scanner;

public class Last_character {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	str = str+" ";
//	System.out.println(str);h
	
	for (int i=0;i<str.length();i++)
	{
		if (str.charAt(i) == ' ')
		{
			if(str.charAt(i-1)>='a' && str.charAt(i-1)<='z' || str.charAt(i-1)>='A' && str.charAt(i-1)<='Z'){
				System.out.print(str.charAt(i-1));
			}
			{
				
			}
		}
	}
	
	}
}
