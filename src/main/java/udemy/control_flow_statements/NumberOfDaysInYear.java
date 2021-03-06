package udemy.control_flow_statements;

public class NumberOfDaysInYear {
    public Boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }else if (year % 400 == 0){
            return true;
        }
        return false;
    }
    public int getDaysInMonth(int month, int year){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return -1;
        }
    }
}
