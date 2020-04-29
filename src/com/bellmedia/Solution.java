package com.bellmedia;

public class Solution {

    public static final int DAYS_IN_A_WEEK = 7;
    public static String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

    public static String getKDaysLater(String s, int k) {
        // Ensure the k values are valid
        if (k < 0 || k > 500) {
            System.out.println("K must be between 0 and 500");
            return null;
        }

        // Get index of the starting day
        int startingDayIndex = getStartingDayIndex(s);

        // Ensure the passed day is valid.
        if (startingDayIndex == -1) {
            System.out.println("The input day is invalid.");
            return null;
        }

        // Calculate the Kth day later
        int kthDayIndex = getKthDayIndex(startingDayIndex, k);

        // return the Kth day
        return days[kthDayIndex];
    }

    public static int getStartingDayIndex(String startingDay) {
        int startingDayIndex = -1;
        for (int i = 0; i < days.length; i++) {
            if (startingDay.equalsIgnoreCase(days[i])) {
                startingDayIndex = i;
                break;
            }
        }

        return startingDayIndex;
    }

    public static int getKthDayIndex(int startingDayIndex, int k) {
        return (startingDayIndex + k) % DAYS_IN_A_WEEK;
    }

    public static void main(String[] args) {
        System.out.println(getKDaysLater("wed", 2));
        System.out.println(getKDaysLater("Sat", 23));
    }
}