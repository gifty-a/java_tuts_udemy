package udemy.oop_part_one;

public class Vehicle {
    private String name;
    private String size;

    private double currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("steering in " + this.currentDirection + " direction");
    }

    public void move(double velocity, int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle moving at " + this.currentVelocity + "ms2 and in direction " + this.currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
