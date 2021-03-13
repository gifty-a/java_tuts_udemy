package udemy.control_flow_statements;

public class LastDigitChecker {
    private static final int RANGE_MIN = 10;
    private static final int RANGE_MAX = 1000;
    public boolean hasSameLastDigit(int x, int y, int z){
        if ((x < RANGE_MIN) || (x > RANGE_MAX) || (y < RANGE_MIN) || (y > RANGE_MAX) || (z < RANGE_MIN) || (z > RANGE_MAX)){
            return false;
        }
        if (x % 10 == y % 10) return true;
        else if (x % 10 == z % 10) return true;
        else if (y % 10 == z % 10) return true;
        else return false;
    }
}
