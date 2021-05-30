package udemy.section_8.array.reverse_arr_challenge;

import java.util.Arrays;

public class Reverse {
    public void reverseArray(int[] arr){
        int[] arrCopy = arr;
        arr = new int[arrCopy.length];
        System.out.println("Arr" + Arrays.toString(arr));
        System.out.println("ArrCopy" + Arrays.toString(arrCopy));
        for (int i = arrCopy.length - 1,j = 0; i < arrCopy.length && j <arrCopy.length; i--, j++){
            arr[j] = arrCopy[i];
//            System.out.println(arr[j]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
