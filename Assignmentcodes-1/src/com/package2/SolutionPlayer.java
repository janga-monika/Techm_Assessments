package com.package2;
import java.util.*;

public class SolutionPlayer {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for (int i=0;i<4;i++) {
            int id=sc.nextInt();
            sc.nextLine(); 
            String name=sc.nextLine();
            int iccRank=sc.nextInt();
            int matchesPlayed=sc.nextInt();
            int runsScored=sc.nextInt();
            players[i]=new Player(id, name, iccRank, matchesPlayed, runsScored);
        }

        int target=sc.nextInt();
        double[] averageRuns=findAverageOfRuns(players, target);

        for (double avg:averageRuns) {
            if (avg >= 80 && avg <= 100) {
                System.out.println("Grade A");
            } else if (avg >= 50 && avg < 80) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }
    }

    public static double[] findAverageOfRuns(Player[] players,int target) {
        return java.util.Arrays.stream(players)
                .filter(player->player.getMatchesPlayed()>=target)
                .mapToDouble(Player::getAverageRuns)
                .toArray();
    }
}
/*
100
Sachin
5
150
13000
101
Sehwag
4
120
10000
103
Dhoni
7
110
7000
104
Kohli
15
57
4400
100*/