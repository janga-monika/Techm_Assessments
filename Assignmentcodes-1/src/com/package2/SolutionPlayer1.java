package com.package2;
import java.util.*;
public class SolutionPlayer1 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Player1[] players = new Player1[4];

        for (int i=0;i<4;i++) {
            int playerId=sc.nextInt();
            sc.nextLine();  
            String skill=sc.nextLine();
            String level=sc.nextLine();
            int points=sc.nextInt();
            players[i]=new Player1(playerId, skill, level, points);
        }

        sc.nextLine();
        String skill=sc.nextLine();
        String level=sc.nextLine();

        int totalPoints=findPointsForGivenSkill(players, skill);
        if (totalPoints>0) {
            System.out.println(totalPoints);
        } else {
            System.out.println("The given Skill is not available");
        }

        Player1 eligiblePlayer=getPlayerBasedOnLevel(players, level, skill);
        if (eligiblePlayer!=null) {
            System.out.println(eligiblePlayer.getPlayerId());
        } else {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }

    public static int findPointsForGivenSkill(Player1[] players, String skill) {
        int totalPoints = 0;
        for (Player1 player : players) {
            if (player.getSkill().equalsIgnoreCase(skill)) {
                totalPoints += player.getPoints();
            }
        }
        return totalPoints;
    }

    public static Player1 getPlayerBasedOnLevel(Player1[] players, String level, String skill) {
        for (Player1 player : players) {
            if (player.getLevel().equalsIgnoreCase(level) && player.getSkill().equalsIgnoreCase(skill) && player.getPoints() >= 20) {
                return player;
            }
        }
        return null;
    }
}

/*
 * 101
    Cricket
    Basic
    20
    102
    Cricket
    Intermediate
    25
    111
    Football
    Intermediate
    50
    113
    BaseBall
    Advanced
    100
    Cricket
    Intermediate
*/
