package udemy;

public class YearsToDays {
    private static final String INVALID_TEXT = "Invalid Value";
    private static final long YEAR_MINS = 525600;
    private static final long DAY_MINS = 1440;
    String yearText;
    String dayText;
    public void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println(INVALID_TEXT);
        } else if (minutes < YEAR_MINS) {
            yearText = "0y";
            dayText = minutes / DAY_MINS + "d";
            System.out.println(yearText + " "+ dayText);
        } else if (minutes >= YEAR_MINS) {
            yearText = minutes / YEAR_MINS + "y";
            dayText = (minutes % YEAR_MINS) / DAY_MINS + "d";
            System.out.println(yearText + " "+ dayText);
        }
    }
}


// how many minutes make a year? 1440 * 365 = 525600
// how many minutes make a month?
// how many minutes make a day? = 60 * 24 = 1440 minutes