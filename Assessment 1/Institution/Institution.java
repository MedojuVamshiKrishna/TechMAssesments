package techy;

import java.util.Scanner;

public class Institution {
	public Institution(int institutionId, String institutionName, String noOfStudentsPlaced, int noOfStudentsCleared,
			String location) {
		super();
		this.institutionId = institutionId;
		this.institutionName = institutionName;
		this.noOfStudentsPlaced = noOfStudentsPlaced;
		this.noOfStudentsCleared = noOfStudentsCleared;
		this.location = location;
	}
	int institutionId;
	String institutionName ;
	String noOfStudentsPlaced ;
	int noOfStudentsCleared;
	String location ; 
	String grade ;
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getNoOfStudentsPlaced() {
		return noOfStudentsPlaced;
	}
	public void setNoOfStudentsPlaced(String noOfStudentsPlaced) {
		this.noOfStudentsPlaced = noOfStudentsPlaced;
	}
	public int getNoOfStudentsCleared() {
		return noOfStudentsCleared;
	}
	public void setNoOfStudentsCleared(int noOfStudentsCleared) {
		this.noOfStudentsCleared = noOfStudentsCleared;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}

class solution{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Institution[] In = new Institution[n];
		for( int i=0; i<n;i++)
		{
			int institutionId = sc.nextInt();
			String institutionName = sc.next();
			String noOfStudentsPlaced = sc.next() ;
			int noOfStudentsCleared =sc.nextInt();
			String location= sc.next() ;
			
			In[i]= new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
			
		}
		
		String ip1 = sc.next();
		String ip2 = sc.next();
		
		int r1= findNumClearancedByLoc(In, ip1);
		if(r1==0)
		{
			System.out.println("There are no cleared students in this particular location");
		}
		else {
			System.out.println(r1);
		}
		Institution r2 = updateInstitutionGrade(In, ip2);
		
		if(r2==null)
		{
			System.out.println("No Institute is available with the specified name");
		}
		else {
			System.out.println(r2.getInstitutionName()+"::"+r2.getGrade());
		}
		
		
		
	}
	public static int findNumClearancedByLoc(Institution[] instArray, String location)
    {
		int s=0;
		for(Institution in : instArray) {
			if(in.getLocation().equalsIgnoreCase(location)) {
				s+=in.noOfStudentsCleared;
			}
		}
		return s;
    //method logic
    }

    public static Institution updateInstitutionGrade(Institution[] instArray, String instName)
    {
    	float rating;
    	for(Institution in : instArray) {
			if(in.getInstitutionName().equalsIgnoreCase(instName)) 
			{
				rating = (Integer.parseInt(in.getNoOfStudentsPlaced())*100)/in.getNoOfStudentsCleared();
				if (rating >= 80) 
				{
                    in.setGrade("A");
                } 
				else
                {
                    in.setGrade("B");
                }
				return in;
			}
		} 
		return null;
    //method logic
    }
	
}