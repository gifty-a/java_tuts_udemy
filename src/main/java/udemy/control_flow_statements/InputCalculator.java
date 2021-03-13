package udemy.control_flow_statements;

import java.util.ArrayList;
import java.util.Scanner;

public class InputCalculator {
    public void inputThenPrintSumAndAverage(){
        ArrayList<Integer> arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number");
            if (scanner.hasNextInt()){
                int num = scanner.nextInt();
                arrayList.add(num);
            }else break;
            scanner.nextLine();
        }
        System.out.println("sum: " + sum(arrayList) + " avg: " + avg(arrayList));
    }
    private int sum(ArrayList<Integer> arrayList){
        int total = 0;
        for (int i = 0; i < arrayList.size(); i++){
            total += arrayList.get(i);
        }
        return total;
    }
    private double avg(ArrayList<Integer> arrayList){
        return sum(arrayList)/arrayList.size();
    }
}
