package udemy.oop_part_two.polymorphism;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "'s Engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is stopping";
    }
}
