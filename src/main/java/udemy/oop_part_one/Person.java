package udemy.oop_part_one;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        return ((this.age > 12) && (this.age < 20));
    }

    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
        else if(this.firstName.isEmpty()) return this.lastName;
        else if (this.lastName.isEmpty()) return this.firstName;
        return this.firstName + " " + this.lastName;
    }
}
