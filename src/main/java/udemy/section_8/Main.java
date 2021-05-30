package udemy.section_8;

import udemy.section_8.array.Desc;
import udemy.section_8.array.min_elem_challenge.MinimumElem;
import udemy.section_8.array.reverse_arr_challenge.Reverse;
import udemy.section_8.list_arraylist.GroceryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    private static boolean halt = false;
    public static void main(String[] args) {
        int choice = 0;
        printInstructions();
        while (!halt) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    groceryList.printShoppingList();
                    break;
                case 2 :
                    addItem();
                    break;
                case 3 :
                    modifyItem();
                    break;
                case 4 :
                    removeItem();
                    break;
                case 5 :
                    search();
                    break;
                case 6 :
                    processArrayList();
                    break;
                case 7 :
                    closeApplication();
                    break;
            }
        }

    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options ");
        System.out.println("\t 1 - To print the list of Grocery Items ");
        System.out.println("\t 2 - To add an item to the list. ");
        System.out.println("\t 3 - To modify an item in the list. ");
        System.out.println("\t 4 - To remove an item from the list ");
        System.out.println("\t 5 - To search for an item in the list ");
        System.out.println("\t 6 - To process the List ");
        System.out.println("\t 7 - To quit the application ");
    }
    public static void addItem() {
        System.out.println("Add item to your shopping list");
        String item = scanner.nextLine();
        groceryList.addItem(item);
    }

    public static void modifyItem() {
        System.out.println("Find item to modify");
        String currentItem = scanner.nextLine();
        System.out.println("Enter new item");
        String newItem = scanner.nextLine();
        groceryList.modifyShoppingList(currentItem, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter index of Item to remove");
        String item = scanner.nextLine();
        groceryList.removeItem(item);
    }

    public static void search() {
        System.out.println("Search...");
        String searchItem = scanner.nextLine();
        if (groceryList.partOflist(searchItem)) {
            System.out.println("Found " + searchItem + " in grocery list");
        } else System.out.println("Not part of list");
    }

    public static void processArrayList() {
        ArrayList<String> newArrayList = new ArrayList<>(groceryList.getShoppingList());
        String[] newArray = new String[groceryList.getShoppingList().size()];
        newArray = groceryList.getShoppingList().toArray(newArray);
    }

    public static void closeApplication() {
        System.out.println("Closing APplication...");
        scanner.close();
        System.out.println("Byeeeeeee");
        halt = true;
    }
}


//        Reverse reverse = new Reverse();
//        int[] myArray = {1,2,3,4,5,6};
//        reverse.reverseArray(myArray);
//        System.out.println("Reversed Array " + Arrays.toString(myArray));
//        MinimumElem minimumElem = new MinimumElem();
//        int arrSize = minimumElem.readInteger();
//        int[] arrSet = minimumElem.readElements(arrSize);
//        System.out.println(minimumElem.findMin(arrSet));
//        Desc desc = new Desc();
//        int[] myIntegerArray = desc.getIntegers(5);
//        desc.printArray(myIntegerArray);
//        desc.printArray(desc.sortIntegers(myIntegerArray));