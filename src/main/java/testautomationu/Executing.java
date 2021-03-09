package testautomationu;

public class Executing {
    Animal dog1 = new Dog("Jaguar");

    public static void main(String[] args) {
        Executing executing = new Executing();
        executing.dog1.makeSound();
        ((Dog)executing.dog1).digUp();
    }
}
