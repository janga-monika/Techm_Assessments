package com.package2;
import java.util.*;
public class SolutionMedicine {
	public static Integer[] getPriceByDisease(Medicine[] m, String disease) {
        ArrayList<Integer> l = new ArrayList<>();
        for (Medicine med : m) {
            if (med.getDisease().equalsIgnoreCase(disease)) {
                l.add(med.getPrice());
            }
        }
        Integer[] prices=l.toArray(new Integer[0]);
        Arrays.sort(prices);
        return prices;
    }
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Medicine[] m=new Medicine[4];
        for (int i=0;i<4;i++) 
        {
            String medicineName=sc.nextLine();
            String batch=sc.nextLine();
            String disease=sc.nextLine();
            int price=sc.nextInt();
            sc.nextLine(); 
            m[i]=new Medicine(medicineName,batch,disease,price);
        }
        String disease=sc.nextLine();
        Integer[] r=getPriceByDisease(m,disease);
        
        for (int price:r) {
            System.out.println(price);
        }

	}

}
/*
dolo650
FAC124W
fever
100
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
200
aspirin
ASP849Q
flu
250
fever
*/