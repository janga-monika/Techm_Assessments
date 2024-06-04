package com.package2;

import java.util.Scanner;

public class SolutionCar {
	
	public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
        int sum=0;
        for (AutonomousCar car:cars) {
            if (car.getEnvironment().equalsIgnoreCase(environment)) {
                sum+=car.getNoOfTestsPassed();
            }
        }
        return sum;
    }
	
	public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String brand) {
        for (AutonomousCar car:cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                int rating=(car.getNoOfTestsPassed()*100)/car.getNoOfTestsConducted();
                if (rating>=80) {
                    car.setGrade("A1");
                } else {
                    car.setGrade("B2");
                }
                return car;
            }
        }
        return null;
    }
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        AutonomousCar[] cars=new AutonomousCar[4];

        for (int i=0;i<4;i++) {
            int carId=Integer.parseInt(sc.nextLine());
            String brand=sc.nextLine();
            int noOfTestsConducted=Integer.parseInt(sc.nextLine());
            int noOfTestsPassed=Integer.parseInt(sc.nextLine());
            String environment=sc.nextLine();
            cars[i]=new AutonomousCar(carId,brand,noOfTestsConducted,noOfTestsPassed,environment);
        }

        String searchEnv = sc.nextLine();
        String searchBrand = sc.nextLine();
        
        int total=findTestPassedByEnv(cars,searchEnv);
        if(total>0) {
            System.out.println(total);
        } 
        else {
            System.out.println("There are no tests passed in this particular environment");
        }

        
        AutonomousCar carWithUpdatedGrade=updateCarGrade(cars, searchBrand);
        if (carWithUpdatedGrade!=null) {
            System.out.println(carWithUpdatedGrade.getBrand()+ ":" + carWithUpdatedGrade.getGrade());
        } else {
            System.out.println("No Car is available with the specified brand");
        }
        
        
        
 
	}

}
