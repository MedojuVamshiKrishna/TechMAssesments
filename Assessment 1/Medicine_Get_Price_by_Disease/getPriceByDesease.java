package techy;

import java.util.Scanner;

public class getPriceByDesease {
	public getPriceByDesease(String medicineName, String batch, String disease, int price) {
		super();
		MedicineName = medicineName;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}
	String MedicineName ;
	String batch ;
	String disease;
	int price ;
	public String getMedicineName() {
		return MedicineName;
	}
	public void setMedicineName(String medicineName) {
		MedicineName = medicineName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		
	}


}


class solution1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getPriceByDesease[]  p = new getPriceByDesease[n];
		for (int i =0; i<n;i++)
		{
			String MedicineName = sc.next();
			String batch = sc.next();
			String disease =sc.next();
			int price = sc.nextInt();
			
			p[i]= new getPriceByDesease(MedicineName, batch, disease, price);
		}
		String s = sc.next();
		int[] a = PriceByDisease(p, s);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			System.out.println(a[i]);
		}
		
	}

	 static int[] PriceByDisease(getPriceByDesease[] p, String s) {
		// TODO Auto-generated method stub
		 int j=0;
		 int[] r = new int[p.length];
		 for (getPriceByDesease i  : p)
		 {
			 if(i.getDisease().equalsIgnoreCase(s))
			 {
				 r[j]=i.getPrice();
				 j+=1;
			 }
		 }
		return r;
	}
}
















