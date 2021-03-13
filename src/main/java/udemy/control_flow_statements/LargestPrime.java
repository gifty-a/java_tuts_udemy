package udemy.control_flow_statements;

public class LargestPrime {
    public int getLargestPrimeFactor(int param){
        int startFactor = 1;
        int currentLargestPrime = 0;
        if (param <= 2) return -1;
        while (startFactor < param){
            if (param % startFactor == 0){
                if (isPrime(startFactor)) currentLargestPrime = startFactor;
            }
            startFactor++;
        }
        return currentLargestPrime;
    }
    public boolean isPrime(int val){
        if (val < 2) return false;
        for (int i = 2; i < val; i++){
            if (val % i == 0) return false;
        }
        return true;
    }
}
