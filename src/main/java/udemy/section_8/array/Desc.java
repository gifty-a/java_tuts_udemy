package udemy.section_8.array;

import java.util.Arrays;
import java.util.Scanner;

public class Desc {
    public int[] getIntegers(int size){
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter a number");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }

    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " : " + arr[i]);
        }
        System.out.println("End of Array...");
    }

    public int[] sortIntegers(int[] unSortedArr){
        int[] sortedArr = Arrays.copyOf(unSortedArr, unSortedArr.length);
        int currElem;
        for (int i = 0; i < sortedArr.length - 1; i++){
            System.out.println(sortedArr.length);
            if (sortedArr[i] < sortedArr[i+1]){
                currElem = sortedArr[i];
                sortedArr[i] = sortedArr[i + 1];
                sortedArr[i + 1] = currElem;
                i--;
            }
        }
        return sortedArr;
    }
}
