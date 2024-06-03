package techy;

import java.util.Scanner;

public class AutonomousCar {
	public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
		super();
		this.carId = carId;
		Brand = brand;
		this.noOfTestsConducted = noOfTestsConducted;
		this.noOfTestsPassed = noOfTestsPassed;
		this.environment = environment;
	}
	int carId;
	String Brand;
	int noOfTestsConducted;
	int noOfTestsPassed;
	String environment;
	String grade;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getNoOfTestsConducted() {
		return noOfTestsConducted;
	}
	public void setNoOfTestsConducted(int noOfTestsConducted) {
		this.noOfTestsConducted = noOfTestsConducted;
	}
	public int getNoOfTestsPassed() {
		return noOfTestsPassed;
	}
	public void setNoOfTestsPassed(int noOfTestsPassed) {
		this.noOfTestsPassed = noOfTestsPassed;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	static class Solution{
		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        AutonomousCar[] obj = new AutonomousCar[4];
		        for (int i = 0; i < obj.length; i++) {
		            int carId = scanner.nextInt();
		            scanner.nextLine();  
		            String brand = scanner.nextLine();
		            int noOfTestsConducted = scanner.nextInt();
		            int noOfTestsPassed = scanner.nextInt();
		            scanner.nextLine();  
		            String environment = scanner.nextLine();
		            obj[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
		        }

		        String env = scanner.nextLine();
		        String brand = scanner.nextLine();

		        int totalTestsPassed = findTestPassedByEnv(obj, env);
		        if (totalTestsPassed > 0) {
		            System.out.println(totalTestsPassed);
		        } else {
		            System.out.println("There are no tests passed in this particular environment");
		        }

		        AutonomousCar car = updateCarGrade(obj, brand);
		        if (car != null) {
		            System.out.println(car.getBrand()+ "::"+car.getGrade());
		        } else {
		            System.out.println("No Car is available with the specified brand");
		        }
		    }

		    public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
		        int totalTestsPassed = 0;
		        for (AutonomousCar car : cars) {
		            if (car.getEnvironment().equalsIgnoreCase(environment)) {
		                totalTestsPassed += car.getNoOfTestsPassed();
		            }
		        }
		        return totalTestsPassed;
		    }

		    public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String brand) {
		        for (AutonomousCar car : cars) {
		            if (car.getBrand().equalsIgnoreCase(brand)) {
		                int rating = (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();
		                if (rating >= 80) {
		                    car.setGrade("A1");
		                } else {
		                    car.setGrade("B2");
		                }
		                return car;
		            }
		        }
		        return null;
		    }
		
	}
	

}
