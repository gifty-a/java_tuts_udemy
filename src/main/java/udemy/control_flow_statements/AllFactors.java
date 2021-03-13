package udemy.control_flow_statements;

public class AllFactors {
    private static final String INVALID_STRING = "Invalid Value";
    public void printFactors(int num){
        int storedDivisor = num;
        if(num < 1) System.out.println(INVALID_STRING);
        while (storedDivisor > 0){
            if (num % storedDivisor == 0) System.out.print(storedDivisor);
            storedDivisor--;
        }
    }
}
