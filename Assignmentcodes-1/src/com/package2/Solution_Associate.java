package com.package2;
import java.util.*;

import com.package2.Associate;
public class Solution_Associate {

	private static final int NULL = 0;

	public static Associate[] associatesForGivenTechnology(Associate ass[], String searchTech) {
		List<Associate> res=new ArrayList<>();
		for(int i=0;i<ass.length;i++)
		{
			if(searchTech.equalsIgnoreCase(ass[i].getTechnology()) && ass[i].getExperienceInYears()%5==0)
			{
				res.add(ass[i]);
			}
		}
		
		return res.toArray(new Associate[0]);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			Associate ass1=new Associate(101,"Alex","java",15);
			Associate ass2=new Associate(102,"Albert","unix",20);
			Associate ass3=new Associate(103,"alferd","testing",13);
			Associate ass4=new Associate(104,"Alfa","java",15);
			Associate ass5=new Associate(105,"penky","java",29);
			Associate ass[]= {ass1,ass2,ass3,ass4,ass5};
	        String searchTech=sc.nextLine();
	        Associate result[] = associatesForGivenTechnology(ass,searchTech);
	        for (Associate associate:result) {
	            System.out.println(associate.getId());
	        }
	        

	}

}
