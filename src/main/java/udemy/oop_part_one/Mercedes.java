package udemy.oop_part_one;

public class Mercedes extends Car{
    private String model;

    public Mercedes(String model) {
        super("G-wagon", "4WD", 4, 4, 6, false);
        this.model = model;
    }

    public void accelerate(int rate) {
        double newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) stop();
        else if (newVelocity > 0 && newVelocity <= 10) changeGear(1);
        else if (newVelocity > 10 && newVelocity <= 20) changeGear(2);
        else if (newVelocity > 20 && newVelocity <= 30) changeGear(3);
        else changeGear(4);
        if (newVelocity > 0) changeVelocity(newVelocity, getCurrentDirection());
    }
}
