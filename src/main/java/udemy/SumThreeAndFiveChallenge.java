package udemy;

public class SumThreeAndFiveChallenge {
    public static void main(String[] args){
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                if (count == 5){
                    break;
                }
                count++;
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
