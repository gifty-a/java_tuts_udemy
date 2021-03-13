package udemy.control_flow_statements;

import java.util.Scanner;

public class ReadUserInputChallenge {
    public void readUserInput(){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int num;
        while (count <= 10){
            System.out.println("Enter number #" + count);
            if (scanner.hasNextInt()){
                num = scanner.nextInt();
                sum += num;
            }else{
                System.out.println("Invalid number");
            }
            count++;
        }
        scanner.close();
        System.out.println(sum);
    }
}
