package edu.sdccd.cisc191;

public class Main {

    public static void main(String[] args) {
        Day day = Day.getRandomDay();
        System.out.println("Today is " + day);

        // Day[] days = new Day[7];
        switch (day) {
            case MONDAY:
                System.out.println("yawn");
                break;
            case WEDNESDAY:
                System.out.println("humpday");
                break;
            case FRIDAY:
                System.out.println("party!");
                break;
            default:
                System.out.println("meh");
                break;
        }

        Week week = new Week();
        System.out.println("Week with weekends: " + week);
        week.removeWeekends();
        System.out.println("Week without weekends: " + week);
        System.out.println("Random day from this week: " + week.getRandomDay());

    }
}
