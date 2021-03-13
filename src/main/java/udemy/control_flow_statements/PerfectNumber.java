package udemy.control_flow_statements;

public class PerfectNumber {
    public boolean isPerfectNumber(int num){
        int storedDivisor = num;
        int sum = 0;
//        int[] divisors = new int[num];
        if (num < 1) return false;
        while (storedDivisor > 0){
            if (num % storedDivisor == 0){
                if (storedDivisor != num){
                    sum += storedDivisor;
                }
            }
            storedDivisor--;
        }
        return sum == num;
    }
}
