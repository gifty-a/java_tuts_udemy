package udemy.control_flow_statements;

public class NumberSum {
    public int sumFirstAndLastDigit(int number){
        int sum = 0;
        int lastDigit = number % 10;
        if (number < 0) return -1;
        while (number > 9){
            number /= 10;
        }
        sum = lastDigit + number;
        return sum;
    }
}
