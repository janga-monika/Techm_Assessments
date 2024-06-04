package com.package2;
import java.util.*;

import com.package2.Sim;
public class SolutionSim {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sim[] sims=new Sim[5];

        for (int i=0;i<5;i++) {
            int simId = sc.nextInt();
            sc.nextLine(); 
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();
            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }

        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim[] result = transferCircle(sims, circle1, circle2);
        for (Sim sim : result) {
            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
        }
    }

    public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
        ArrayList<Sim> matchingSims = new ArrayList<>();
        
        for (Sim sim : sims) {
            if (sim.getCircle().equalsIgnoreCase(circle1)) {
                matchingSims.add(new Sim(sim.getSimId(), sim.getCustomerName(), sim.getBalance(), sim.getRatePerSecond(), circle2));
            }
        }
        
        matchingSims.sort(Comparator.comparingDouble(Sim::getRatePerSecond).reversed());

        return matchingSims.toArray(new Sim[0]);
    }

}
/*
 * 1
    raju
    130
    1.32
    mum
    2
    sachin
    120
    2.26
    ahd
    3
    ram
    200
    2.54
    kol
    4
    shubham
    640
    3.21
    ahd
    5
    kalpesh
    150
    1.8
    ahd
    ahd
    kol
*/
