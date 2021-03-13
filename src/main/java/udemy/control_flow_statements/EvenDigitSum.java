package udemy.control_flow_statements;

public class EvenDigitSum {
    public int getEvenSum(int number){
        int sum = 0;
        int rem = 0;
        if (number < 0) return -1;
        int lastDigit = number % 10;
        while (number > 0){
            rem = number % 10;
            if (rem % 2 == 0){
                sum += rem;
            }
            number /= 10;
        }
        return sum;
    }
}
