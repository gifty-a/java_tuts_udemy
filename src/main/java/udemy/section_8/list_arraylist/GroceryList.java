package udemy.section_8.list_arraylist;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> shoppingList = new ArrayList<String>();

    public ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public void addItem(String item) {
        if (!shoppingList.contains(item)) shoppingList.add(item);
    }
    public void printShoppingList() {
        System.out.println("Shopping List");
        for (int i = 0; i < shoppingList.size(); i++){
            System.out.println(i + " " + shoppingList.get(i));
        }
    }

    public void modifyShoppingList(String currentItem, String newItem) {
        int indexOfItem = findItem(currentItem);
        if (indexOfItem>= 0) {
            modifyShoppingList(indexOfItem, newItem);
        }
    }
    private void modifyShoppingList(int position, String newItem) {
        shoppingList.set(position,newItem);
        System.out.println("item at position " + position + " has been successfully modified");
    }

    public void removeItem(String itemToBeRemoved) {
        int indexOfItem = findItem(itemToBeRemoved);
        if (indexOfItem >= 0) removeItem(indexOfItem);

    }
    private void removeItem(int position) {
//        String itemToBeRemoved = shoppingList.get(position);
        shoppingList.remove(position);
//        System.out.println("You have removed " + itemToBeRemoved + " from your shopping list");
    }

//    public String findItem(String item) {
//        if (shoppingList.contains(item)){
//            return shoppingList.get(shoppingList.indexOf(item));
//        }else{
//            return null;
//        }
//    }

    private int findItem(String item) {
        return shoppingList.indexOf(item);
    }

    public boolean partOflist(String searchTerm) {
        int index = findItem(searchTerm);
        return index >= 0;
    }
}
