package udemy.oop_part_two.polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }
    public String startEngine(){
        return getClass().getSimpleName() + "'s Engine is starting";
    }
    public String accelerate(){
        return getClass().getSimpleName() + "'s is accelerating";
    }
    public String brake(){
        return getClass().getSimpleName() + "'s' is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
