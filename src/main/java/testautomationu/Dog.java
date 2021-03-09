package testautomationu;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Wo0Of");
    }
    public void digUp(){
        System.out.println("Dog's dig holes");
    }
}
