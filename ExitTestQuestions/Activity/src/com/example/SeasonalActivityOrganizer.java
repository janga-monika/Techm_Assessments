package com.example;

import java.util.EnumSet;
import java.util.Set;

public class SeasonalActivityOrganizer {

    private EnumSet<Activity> springActivities = EnumSet.noneOf(Activity.class);
    private EnumSet<Activity> summerActivities = EnumSet.noneOf(Activity.class);
    private EnumSet<Activity> autumnActivities = EnumSet.noneOf(Activity.class);
    private EnumSet<Activity> winterActivities = EnumSet.noneOf(Activity.class);

    public Set<Activity> getActivitiesForSeason(Season season) {
        switch (season) {
            case SPRING:
                return springActivities;
            case SUMMER:
                return summerActivities;
            case AUTUMN:
                return autumnActivities;
            case WINTER:
                return winterActivities;
            default:
                throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    public Set<Activity> addActivityForSeason(Activity activity, Season season) {
        switch (season) {
            case SPRING:
                springActivities.add(activity);
                return springActivities;
            case SUMMER:
                summerActivities.add(activity);
                return summerActivities;
            case AUTUMN:
                autumnActivities.add(activity);
                return autumnActivities;
            case WINTER:
                winterActivities.add(activity);
                return winterActivities;
            default:
                throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    public void removeActivityFromAllSeasons(Activity activity) {
        springActivities.remove(activity);
        summerActivities.remove(activity);
        autumnActivities.remove(activity);
        winterActivities.remove(activity);
    }

    public Set<Activity> getAllActivities() {
        EnumSet<Activity> allActivities = EnumSet.noneOf(Activity.class);
        allActivities.addAll(springActivities);
        allActivities.addAll(summerActivities);
        allActivities.addAll(autumnActivities);
        allActivities.addAll(winterActivities);
        return allActivities;
    }

    public static void main(String[] args) {
        SeasonalActivityOrganizer organizer = new SeasonalActivityOrganizer();

        organizer.addActivityForSeason(Activity.HIKING, Season.SPRING);
        organizer.addActivityForSeason(Activity.SWIMMING, Season.SUMMER);
        organizer.addActivityForSeason(Activity.SKIING, Season.WINTER);

        System.out.println(organizer.getAllActivities()); // [HIKING, SWIMMING, SKIING]
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING)); // [HIKING]
        System.out.println(organizer.getActivitiesForSeason(Season.SUMMER)); // [SWIMMING]
        System.out.println(organizer.getActivitiesForSeason(Season.WINTER)); // [SKIING]

        organizer.removeActivityFromAllSeasons(Activity.HIKING);
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING)); // []
    }
}
