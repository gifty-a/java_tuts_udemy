package udemy.section_8.list_arraylist.arraylist_chall;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();
    //add
    private void addContact(Contact contact) {
        if (exists(contact.getFirstName()) < 0) contacts.add(contact);
        System.out.println(contact.getFirstName() + " has been added successfully");
    }
    //add
    public void addContact(String name, String phone) {
//        System.out.println(name + " " + phone);
//        System.out.println(new Contact(name, phone).getFirstName());
        addContact(new Contact(name, phone));
    }

    //update
    private void updateContact(Contact currentContact, Contact newContact) {
        if (exists(currentContact.getFirstName()) >= 0) {
            currentContact.setPhone(newContact.getPhone());
            currentContact.setFirstName(newContact.getFirstName());
//            if (newContact.getLastName() != null) {
//                currentContact.setLastName(newContact.getLastName());
//            }
        }
    }

    public void updateContact(String firstName, String newInfo, Option option) {
        System.out.println(exists(firstName));
        Contact currentContact = contacts.get(exists(firstName));
        if (option == Option.PHONE) currentContact.setPhone(newInfo);
        else if (option == Option.NAME) currentContact.setFirstName(newInfo);
//        if (option == Option.PHONE) updateContact(currentContact, new Contact(currentContact.getFirstName(), newInfo));
//        else if (option == Option.NAME) updateContact(currentContact, new Contact(firstName, currentContact.getPhone()));
    }
//    public void updateContact(String firstName, String newPhone, Option.PHONE) {
//        Contact currentContact = contacts.get(exists(firstName));
//        updateContact(currentContact, new Contact(currentContact.getFirstName(), newPhone));
//    }
    public void updateContact(String firstName, String newName, String newPhone) {
        System.out.println(exists(firstName));
        Contact currentContact = contacts.get(exists(firstName));
        currentContact.setFirstName(newName);
        currentContact.setPhone(newPhone);
//        updateContact(currentContact, new Contact(newName, newPhone));
    }


//    public void updateContact(String firstName, String newPhoneNumber, updateOption updateOption) {
//        Contact currentContact = contacts.get(exists(firstName));
//        if (updateOption == MobilePhone.updateOption.name) {
//            updateContact(currentContact , new Contact(firstName, currentContact.getPhone()));
//        }else if (updateOption == MobilePhone.updateOption.phone) {
//            updateContact(currentContact,new Contact(currentContact.getFirstName(),newPhoneNumber));
//        }else if (updateOption == MobilePhone.updateOption.both) {
//            updateContact(currentContact, new Contact(firstName, newPhoneNumber));
//        }
//    }

    //findContact
    public Contact findContact(String name) {
        int index = exists(name);
        if (index >= 0) return contacts.get(index);
        else return null;
    }

    //getAllContacts
//    public ArrayList<Contact> getContacts() {
//        return this.contacts;
//    }
    public void getContacts() {
        if (contacts.size() == 0) System.out.println("OOps You are lonely!");
        contacts.forEach(contact -> {
            System.out.println("name : " + contact.getFirstName() + " phone: " + contact.getPhone());
        });
    }

    //removeContact
    public void removeContact(String name) {
        int index = exists(name);
        if (index >= 0) contacts.remove(index);
    }

    private int exists(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName() == name) {
                return i;
            }
        }
        return -1;
    }

    public enum Option{
        PHONE, NAME
    }
//    public enum updateOption{
//        name, phone, both
//    }
}
