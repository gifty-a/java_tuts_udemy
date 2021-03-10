package udemy.control_flow_statements;

public class DayOfTheWeekChallenge {
    private static final String INVALID_TEXT = "Invalid day";
    private static final String REST = "other";
    public void printDayoftheWeek(int day){
        switch (day){
            case 0:
                System.out.println(Day.SUNDAY);
                break;
            case 1:
                System.out.println(Day.MONDAY);
                break;
            case 2:
                System.out.println(Day.TUESDAY);
                break;
            case 3:
                System.out.println(Day.WEDNESDAY);
                break;
            case 4:
                System.out.println(Day.THURSDAY);
                break;
            case 5:
                System.out.println(Day.FRIDAY);
                break;
            case 6:
                System.out.println(Day.SATURDAY);
                break;
            default:
                System.out.println(INVALID_TEXT);
                break;
        }
    }
    public void printNumberInWord(int number){
        switch (number) {
            case 0:
                System.out.println(Numbers.ZERO);
                break;
            case 1:
                System.out.println(Numbers.ONE);
                break;
            case 2:
                System.out.println(Numbers.TWO);
                break;
            case 3:
                System.out.println(Numbers.THREE);
                break;
            case 4:
                System.out.println(Numbers.FOUR);
                break;
            case 5:
                System.out.println(Numbers.FIVE);
                break;
            case 6:
                System.out.println(Numbers.SIX);
                break;
            case 7:
                System.out.println(Numbers.SEVEN);
                break;
            case 8:
                System.out.println(Numbers.EIGHT);
                break;
            case 9:
                System.out.println(Numbers.NINE);
                break;
            default:
                System.out.println(REST);
                break;
        }
    }
}
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}
enum Numbers {
    ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE
}