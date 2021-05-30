package udemy.section_8.array.min_elem_challenge;

import java.util.Scanner;

public class MinimumElem {
    Scanner scanner = new Scanner(System.in);
    public int readInteger(){
        System.out.println("How many numbers would you");
        int numOfElem = scanner.nextInt();
        return numOfElem;
    }
    public int[] readElements(int size){
        int[] arr = new int[size];
        int count = 0;
        while (count < 5){
            System.out.println("Enter a number");
            int input = scanner.nextInt();
            arr[count] = input;
            count++;
        }
        scanner.close();
        return arr;
    }

    public int findMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
