package udemy.section_8;

import udemy.section_8.array.Desc;

public class Main {
    public static void main(String[] args) {
        Desc desc = new Desc();
        int[] myIntegerArray = desc.getIntegers(5);
//        desc.printArray(myIntegerArray);
        desc.printArray(desc.sortIntegers(myIntegerArray));
    }
}
