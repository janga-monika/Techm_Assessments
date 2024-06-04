package com.package2;
import com.package2.Travel_Agencies;
public class Solution {
	
	public static Travel_Agencies agencyDetailsForGivenldAndType(Travel_Agencies obj[],int regNo,String pakageType){
		for(int i=0;i<obj.length;i++)
		{
			if(obj[i].get_regNo()==regNo && obj[i].get_pakageType().equalsIgnoreCase(pakageType))
			{
				return obj[i];
			}
		}
		return null;
		
	}
	
	
	public static int findAgencyWithHighestPackagePrice(Travel_Agencies obj[]){
		int max=-1,p=0;
		for(int i=0;i<obj.length;i++)
		{
			p=obj[i].get_price();
			if(p>max)
			{
				max=p;
			}
		}
		return max;
	}
	
	
	
	public static void main(String[] args) {
		Travel_Agencies ob1=new Travel_Agencies(123,"A2Z Agency","Platinum",50000,true);
		Travel_Agencies ob2=new Travel_Agencies(345,"SSS Agency","Gold",30000,false);
		Travel_Agencies ob3=new Travel_Agencies(987,"cos and Kings","Diamond",40000,true);
		Travel_Agencies ob4=new Travel_Agencies(888,"Global tours","Gold",20000,false);
		Travel_Agencies ag[]= {ob1,ob2,ob3,ob4};
		System.out.println(findAgencyWithHighestPackagePrice(ag));
		
		Travel_Agencies res=agencyDetailsForGivenldAndType(ag,987,"Diamond");
		if (res != null) {
            System.out.println(res.get_agencyName() + ":" + res.get_price());
        } else {
            System.out.println("No matching agency found.");
        }
		
		}
		
	}

