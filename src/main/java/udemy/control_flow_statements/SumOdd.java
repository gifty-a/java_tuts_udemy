package udemy.control_flow_statements;

public class SumOdd {
    public Boolean isOdd(int num){
        if (num < 0){
            return false;
        }
        if (num % 2 != 0){
            return true;
        }else{
            return false;
        }
    }
    public int sumOddNumbers(int min, int max){
        int sum = 0;
        if ((max >= min) && (max >= 0) && (min >= 0)){
            for(int i = min; i <= max; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
        }else{
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new SumOdd().sumOddNumbers(100, -100));
    }
}
