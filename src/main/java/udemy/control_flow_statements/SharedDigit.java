package udemy.control_flow_statements;

public class SharedDigit {
    private static final int RANGE_MIN = 10;
    private static final int RANGE_MAX = 99;
    public boolean hasSharedDigit(int a,int b){
        String convertedA = Integer.toString(a);
        String convertedB = Integer.toString(b);
        if ((a < RANGE_MIN) || (a > RANGE_MAX) || (b < RANGE_MIN) || (b > RANGE_MAX)){
            return false;
        }
        for(int i = 0; i < convertedA.length(); i++){
            if (convertedB.indexOf(convertedA.charAt(i)) != -1){
                return true;
            }
        }
        return false;
    }
}
