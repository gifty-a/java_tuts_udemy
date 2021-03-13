package udemy.control_flow_statements;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public void getMinMaxValues(){
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true){
            System.out.println("Enter number :");
            if (scanner.hasNextInt()){
                int num = scanner.nextInt();
                max = num > max ? num : max;
                min = num < min ? num : min;
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min: " + min + " max: " + max);
        scanner.close();
    }
}
