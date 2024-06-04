package com.package2;
import java.util.*;
public class SolutionVessel {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NavelVessel vessels[]=new NavelVessel[4];
        
        for (int  i=0;i<4;i++) {
            int vesselId=sc.nextInt();
            sc.nextLine();  
            String vesselName=sc.nextLine();
            int noOfVoyagesPlanned=sc.nextInt();
            int noOfVoyagesCompleted=sc.nextInt();
            sc.nextLine(); 
            String purpose=sc.nextLine();
            vessels[i]=new NavelVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        int percentage=sc.nextInt();
        sc.nextLine();  
        String purpose=sc.nextLine();
    

        double avgVoyages=findAvgVoyagesByPct(vessels, percentage);
        if (avgVoyages > 0) {
            System.out.println((int) avgVoyages);
        } else {
            System.out.println(0);
        }

        NavelVessel vessel=findVesselByGrade(vessels, purpose);
        if (vessel!=null) {
            System.out.println(vessel.getVesselName() + "%" + vessel.getClassification());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }

    public static double findAvgVoyagesByPct(NavelVessel[] vessels, int percentage) {
        int sumVoyages=0;
        int count=0;
        for (NavelVessel vessel : vessels) {
            int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
            if (pct >= percentage) {
                sumVoyages += vessel.getNoOfVoyagesCompleted();
                count++;
            }
        }
        if (count==0) {
            return 0;
        }
        return (double)sumVoyages/count;
    }

    public static NavelVessel findVesselByGrade(NavelVessel[] vessels, String purpose) {
        for (NavelVessel vessel : vessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
                int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                if (pct == 100) {
                    vessel.setClassification("Star");
                } else if (pct >= 80) {
                    vessel.setClassification("Leader");
                } else if (pct >= 55) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        return null;
    }

}
/*111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army
*/