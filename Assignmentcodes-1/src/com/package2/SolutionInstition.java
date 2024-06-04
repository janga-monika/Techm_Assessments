package com.package2;

import java.util.Scanner;

public class SolutionInstition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Institution[] institutions=new Institution[4];
        
        for (int i=0;i<4;i++) {
            int institutionId=sc.nextInt();
            sc.nextLine();  
            String institutionName=sc.nextLine();
            int noOfStudentsPlaced=sc.nextInt();
            int noOfStudentsCleared=sc.nextInt();
            sc.nextLine();  
            String location=sc.nextLine();
            institutions[i]=new Institution(institutionId,institutionName,noOfStudentsPlaced,noOfStudentsCleared,location);
        }
        String location=sc.nextLine();
        String institutionName=sc.nextLine();
        int cleared=findNumClearancedByLoc(institutions,location);
        if(cleared>0) 
        {
            System.out.println(cleared);
        } 
        else 
        {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution inst=updateInstitutionGrade(institutions,institutionName);
        if(inst!=null) 
        {
            System.out.println(inst.getInstitutionName() + ":" + inst.getGrade());
        } 
        else 
        {
            System.out.println("No Institute is available with the specified name");
        }
	}

	private static Institution updateInstitutionGrade(Institution[] institutions, String institutionName) {
		for (Institution i:institutions) {
            if (i.getInstitutionName().equalsIgnoreCase(institutionName)) {
                int rating=(i.getNoOfStudentsPlaced()*100)/i.getNoOfStudentsCleared();
                if(rating>=80) 
                {
                    i.setGrade("A");
                } else 
                {
                    i.setGrade("B");
                }
                return i;
            }
        }
        return null;
	}

	private static int findNumClearancedByLoc(Institution[] institutions, String location) {
		int t=0;
        for(Institution i:institutions) {
            if (i.getLocation().equalsIgnoreCase(location)) {
                t+=i.getNoOfStudentsCleared();
            }
        }
        return t;
	}

}

/*
 * 111
    Amrita
    5000
    10000
    Chennai
    222
    Karunya
    16000
    20000
    Coimbatore
    333
    AppleTech
    10000
    12000
    Chennai
    444
    Aruna
    6000
    10000
    Vellore
    Chennai
    Karunya
 */
