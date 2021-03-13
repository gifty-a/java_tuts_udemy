package udemy.control_flow_statements;

public class FlourPack {
    private static final int BIG_COUNT_KILOS = 5;
    public boolean canPack(int bigcount, int smallcount, int goal){
        if (bigcount < 0 || smallcount < 0 || goal < 0) return false;
        else if ((BIG_COUNT_KILOS * bigcount) + smallcount < goal) return false;
        return (goal % BIG_COUNT_KILOS <= smallcount);
    }
}
