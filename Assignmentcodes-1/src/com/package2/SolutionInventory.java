package com.package2;

import java.util.ArrayList;
import java.util.Scanner;

public class SolutionInventory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Inventory[] inventories = new Inventory[4];
        
        for (int i = 0; i < 4; i++) {
            String inventoryId=sc.nextLine();
            int maximumQuantity=sc.nextInt();
            int currentQuantity=sc.nextInt();
            int threshold=sc.nextInt();
            sc.nextLine(); 
            inventories[i]=new Inventory(inventoryId,maximumQuantity,currentQuantity,threshold);
        }
        int limit=sc.nextInt();
Inventory[] result=replenish(inventories, limit);
        
        for (Inventory inv : result) {
            int threshold = inv.getThreshold();
            String fillingType;
            if(threshold>75) 
            {
                fillingType = "Critical Filling";
            } 
            else 
            if(threshold>=50) {
                fillingType="Moderate Filling";
            } 
            else 
            {
                fillingType="Non-Critical Filling";
            }
            System.out.println(inv.getInventoryId()+" "+fillingType);
        }
	}

	private static Inventory[] replenish(Inventory[] inventories, int limit) {
		ArrayList<Inventory> result=new ArrayList<>();
        for (Inventory inv:inventories) {
            if(inv.getThreshold()<=limit) {
                result.add(inv);
            }
        }
        return result.toArray(new Inventory[0]);
	}

}
/*
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45
*/