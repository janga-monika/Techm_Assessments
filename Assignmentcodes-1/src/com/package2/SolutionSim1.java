package com.package2;
import java.util.*;
public class SolutionSim1 {
	public static void main(String argsv[]) {
	Scanner sc = new Scanner(System.in);
    Sim1 sims[]=new Sim1[4];

    for (int i=0;i<4;i++) {
        int id = sc.nextInt();
        sc.nextLine();  
        String company=sc.nextLine();
        int balance=sc.nextInt();
        double ratePerSecond=sc.nextDouble();
        sc.nextLine(); 
        String circle=sc.nextLine();
        sims[i]=new Sim1(id,company,balance,ratePerSecond,circle);
    }

    String searchCircle= sc.nextLine();
    double searchRate=sc.nextDouble();

    int[] resultIds=matchAndSort(sims, searchCircle, searchRate);
    for (int id : resultIds) {
        System.out.println(id);
    }
}

public static int[] matchAndSort(Sim1[] sims, String searchCircle, double searchRate) {
 
    Sim1[] filteredSims = Arrays.stream(sims)
                                .filter(sim -> sim.getCircle().equalsIgnoreCase(searchCircle) && sim.getRatePerSecond() < searchRate)
                                .toArray(Sim1[]::new);

    
    Arrays.sort(filteredSims, Comparator.comparingInt(Sim1::getBalance).reversed());

 
    int[] resultIds = new int[filteredSims.length];
    for (int i = 0; i < filteredSims.length; i++) {
        resultIds[i] = filteredSims[i].getId();
    }

    return resultIds;
}
}
/*
1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4*/