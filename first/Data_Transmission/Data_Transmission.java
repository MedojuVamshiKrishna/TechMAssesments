package techy;

import java.util.Scanner;

public class Data_Transmission {
 public static void main(String args[])
 {
	 Scanner s = new Scanner(System.in);
	 int n= s.nextInt()	;
	 int c = 0;
	 String[] a = new String[n];
	 
	 for(int i=0;i<n;i++)
	 {
		 String t = s.next();
		 a[i]=t;
		 
	 }
	 int large=1, large2=0;
	 
	 for(int i=0; i<n;i++)
	 {
		 if(i<n-1) {
		 int t= Integer.parseInt(a[i]);
//		 System.out.println(isPrime(t));
		 if(isPrime(t)==true)
		 {
			 if (t>large) {
				 large2=large;
				 large=t;
			 }
			 else if (t>large2 && t!=large) {
				 large2=t;
			 }
			 c+=1;
		 }
		 }
		 else {
			 int x=a[i].length()-1;
			 String t= a[i].substring(0,x);
			 int temp =Integer.parseInt(t);
//			 System.out.println(temp);
//			 System.out.println(isPrime(temp));
			 if(isPrime(temp)==true)
			 {
				 if (temp>large) {
					 large2=large;
					 large=temp;
				 }
				 else if (temp>large2 && temp!=large) {
					 large2=temp;
				 }
				 c+=1;
		 }
		 
	 }}
//	 System.out.println(large);
	 System.out.println("the second largest prime number is: "+large2);
	 System.out.println("the count of total number of primes in data: "+c);
	 System.out.println("the suffix to be added: "+ (int)(c+large2));
 }
 static boolean isPrime(int n)
 {
	 int i,m=0,f=0;
	 m=n/2;
	 if (n==0||n==1)
	 {
		 return false;
	 }
	 else {
		 for (i=2;i<=m;i++)
		 {
			 if(n%i==0){
				 return false;
			 }
		 }
	 }
	 if(f==0)
	 {
		 return true;
	 }
	return false;
 }
}
