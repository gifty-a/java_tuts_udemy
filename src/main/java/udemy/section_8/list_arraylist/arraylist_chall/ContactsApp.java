package udemy.section_8.list_arraylist.arraylist_chall;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ContactsApp {
    static Scanner scanner = new Scanner(System.in);
    static MobilePhone mobilePhone = new MobilePhone();
    static boolean loopVariable = true;
    public static void main(String[] args) {
        while (loopVariable) {
            startApp();
            int selectedOption = scanner.nextInt();
            getSelectedOption(selectedOption);
        }

    }
    public static void printMenu() {
        System.out.println("Select an Option");
        System.out.println("1 : Start app");
        System.out.println("2 : Print all Contacts");
        System.out.println("3 : Add new contact");
        System.out.println("4 : Update Contact");
        System.out.println("5 : Remove Contact");
        System.out.println("6 : Find Contact");
        System.out.println("7 : Quit app");
    }

    public static void startApp() {
        printMenu();
    }
    public static void getSelectedOption(int selectedOption) {
        switch (selectedOption) {
            case 1:
                startApp();
                break;
            case 2:
                printContacts();
                break;
            case 3:
                addContact();
                break;
            case 4:
                updateContact();
                break;
            case 5:
                removeContact();
                break;
            case 6:
                findContact();
                break;
            case 7:
                quitApp();
                break;
        }
    }
    public static void addContact() {
        System.out.println("Enter Contact Name");
        String contactName = scanner.next();
//        System.out.println("name " + contactName);
        System.out.println("Enter Contact Phone Number");
        String contactPhone = scanner.next();
//        System.out.println("phone " + contactPhone);
        mobilePhone.addContact(contactName, contactPhone);
        scanner.nextLine();
    }

    public static void printContacts() {
        mobilePhone.getContacts();
    }

    public static void updateContact() {
        System.out.println("Enter Name of the contact you'd like to update");
        String contactFirstName = scanner.next();
        System.out.println("Select 0 to change name \n Select 1 to change Phone \n Select 2 to change both");
        int selectedOption = scanner.nextInt();
        updateOption(selectedOption,contactFirstName);
        scanner.nextLine();
    }
    public static void quitApp() {
        scanner.close();
        loopVariable = false;
    }
    public static void updateOption(int selectedOption, String contactFirstName) {
        switch (selectedOption) {
            case 0:
                changeContactName(contactFirstName);
                break;
            case 1:
                changeContactPhone(contactFirstName);
                break;
            case 2:
                changeBoth(contactFirstName);
                break;
        }
    }

    public static void changeContactName(String currName) {
        System.out.println("Enter new Name");
        String newName = scanner.next();
        mobilePhone.updateContact(currName, newName, MobilePhone.Option.NAME);
    }

    public static void changeContactPhone(String currName) {
        System.out.println("Enter new Phone Number");
        String newPhone = scanner.next();
        mobilePhone.updateContact(currName, newPhone, MobilePhone.Option.PHONE);
    }
    public static void changeBoth(String currName) {
        System.out.println("Enter new Name");
        String newName = scanner.next();
        System.out.println("Enter new Phone Number");
        String newPhone = scanner.next();
        mobilePhone.updateContact(currName, newName, newPhone);
    }
    public static void removeContact() {
        System.out.println("Enter Name of Contact you'd like to remove");
        String nameOfContact = scanner.next();
        mobilePhone.removeContact(nameOfContact);
        System.out.println(nameOfContact + " has been removed successfully");
    }

    public static void findContact() {
        System.out.println("Enter Name of Contact to search");
        String name = scanner.next();
        Contact contact = mobilePhone.findContact(name);
        System.out.println("name : " + contact.getFirstName() + "\n phone : " + contact.getPhone());
    }

}
