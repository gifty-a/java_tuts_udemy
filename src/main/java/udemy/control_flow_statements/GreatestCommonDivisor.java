package udemy.control_flow_statements;

public class GreatestCommonDivisor {
    public int getGreatestCommonDivisor(int first, int second){
        int firstAsDivisor = Math.max(first, second);
       if (first < 10 || second < 10) return -1;
       //greatest number that can be divide two numbers
        // start from min number - check if it can divide both and decrement
        while (firstAsDivisor != 0){
            if ((first % firstAsDivisor == 0) && (second % firstAsDivisor == 0)){
                return firstAsDivisor;
            }else{
                firstAsDivisor--;
            }
        }
        return -1;
    }
}
