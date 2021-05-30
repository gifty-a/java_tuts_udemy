package udemy.section_8.list_arraylist.arraylist_chall;

public class Contact {
    private String firstName;
//    private String lastName;
    private String phone;

    public Contact(String fName, String phone) {
        this.firstName = fName;
//        this.lastName = lName;
        this.phone = phone;
    }
//    public Contact(String fullName, String phone) {
//        new Contact(fullName,null, phone);
//    }
    public String getFirstName() {
        return this.firstName;
    }
//    public String getLastName() {
//        return this.lastName;
//    }
    public String getPhone() {
        return this.phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
