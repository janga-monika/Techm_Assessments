package com.package2;

import java.util.Scanner;

public class SolutionPhone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Phone ph[] = new Phone[4];
        
        for (int i=0;i<4;i++) {
            int phoneId=sc.nextInt();
            sc.nextLine();
            String os=sc.nextLine();
            String brand=sc.nextLine();
            int price=sc.nextInt();
            sc.nextLine();
            ph[i] = new Phone(phoneId, os, brand, price);
        }

        String brand = sc.nextLine().toLowerCase();
        String os = sc.nextLine().toLowerCase();
        
        int p=findPriceForGivenBrand(ph,brand);
        if(p>0) 
        {
            System.out.println(p);
        }
        else 
        {
            System.out.println("The given Brand is not available");
        }

        Phone phone=getPhoneIdBasedOnOs(ph,os);
        if(phone!=null) 
        {
            System.out.println(phone.getPhoneId());
        } 
        else 
        {
            System.out.println("No phones are available ");
        }
        
	}

	private static Phone getPhoneIdBasedOnOs(Phone[] ph, String os) {
		for(Phone phone:ph) 
		{
            if(phone.getOs().equalsIgnoreCase(os) && phone.getPrice()>=50000) 
            {
                return phone;
            }
        }
        return null;
	}

	private static int findPriceForGivenBrand(Phone[] ph, String brand) {
		int t=0;
        for(Phone phone:ph) 
        {
            if(phone.getBrand().equalsIgnoreCase(brand)) 
            {
                t+=phone.getPrice();
            }
        }
        return t;
	}

}


/*
 * 111
IOS
Apple
30000
222
Android 
Samsung
50000
333
Symbian
HTC
89000
Blackberry
 */
