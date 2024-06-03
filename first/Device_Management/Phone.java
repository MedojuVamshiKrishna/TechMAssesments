package techy;

import java.util.Scanner;

class solution2
{

public static void main(String[] args) throws Throwable
{
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	Phone[] p = new Phone[4];
	
	for (int i=0; i<n;i++)
	{
		int phoneId = s.nextInt() ;
		String os = s.next();
		String brand = s.next() ;
		int price= s.nextInt();
		p[i] = new Phone(phoneId, os, brand, price);
		
	}
//	System.out.println(p[0].phoneId);
	String sBrand = s.next();
	String sOs = s.next();
	
	int x= findPriceForGivenBrand(p, sBrand);
	Phone t = getPhoneIdBasedOnOs(p, sOs);
//	System.out.println(x+" "+ t);
	
	if(x==0)
	{
		System.out.println("The given Brand is not available");
	}
	else 
	System.out.println(x);
	
	if(t==null)
	{
		System.out.println("No phones are available with specified os and price range");
	}
	else
		System.out.println(t.phoneId);

	
	
}

public static int findPriceForGivenBrand(Phone[] phone, String brand) throws Exception
{
	int sum=0;
	for(Phone s: phone)
	{
		if(s.getBrand().equalsIgnoreCase(brand))
		{
			
			sum+=s.price;
		}
	}

	
	return sum;
//method logic
	
}

public static Phone getPhoneIdBasedOnOs(Phone[] phone, String os)
{
//	System.out.println(phone.length);
	for(Phone s: phone)
	{
//		System.out.println(s.os+ " "+ os);
//		System.out.println(s.getOs().equalsIgnoreCase(os));
		if(s.getOs().equalsIgnoreCase(os))
		{
//			System.out.println(os);
			if(s.price>=50000)
			return s;
		}
	}
	return null;
//method logic
}
}

public class Phone {
	public Phone(int phoneId, String os, String brand, int price) {
		super();
		this.phoneId = phoneId;
		this.os = os;
		this.brand = brand;
		this.price = price;
	}
	int phoneId ;
	String os ;
	String brand ;
	int price;
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

