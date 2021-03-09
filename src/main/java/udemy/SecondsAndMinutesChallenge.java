package udemy;

public class SecondsAndMinutesChallenge {
    public String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        } else if (minutes < 60){
            return 00 + "h" + minutes + "m" + seconds + "s";
        } else if(minutes % 60 == 0){
            return (minutes / 60) + "h" + 0 + "m" + seconds + "s";
        }else{
            int hours = calculateHours(minutes)[0];
            int mins =  calculateHours(minutes)[1];
            return hours + "h" + mins + "m" + seconds + "s";
        }
    }
    public int[] calculateHours(int minutes){
            int minutesLeft = minutes % 60;
            int hours = minutes / 60;
            int[] arr = {hours, minutesLeft};
            return arr;
    }
    public String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remSeconds = seconds % 60;
        return getDurationString(minutes, remSeconds);
    }

    public static void main(String[] args) {
        SecondsAndMinutesChallenge secondsAndMinutesChallenge = new SecondsAndMinutesChallenge();
//        int[] arr = secondsAndMinutesChallenge.calculateHours(67);
        System.out.println(secondsAndMinutesChallenge.getDurationString(99,30));
    }
}
