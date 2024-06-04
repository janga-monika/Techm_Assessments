package com.package2;

public class Player {
	private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player(int id,String name,int iccRank,int matchesPlayed,int runsScored) {
        this.id=id;
        this.name=name;
        this.iccRank=iccRank;
        this.matchesPlayed=matchesPlayed;
        this.runsScored=runsScored;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public void setIccRank(int iccRank) {
        this.iccRank=iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed=matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored=runsScored;
    }

    public double getAverageRuns() {
        if (matchesPlayed==0) {
            return 0.0;
        }
        return (double)runsScored/matchesPlayed;
    }
}
