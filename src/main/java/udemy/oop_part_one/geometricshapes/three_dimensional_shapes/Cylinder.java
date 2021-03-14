package udemy.oop_part_one.geometricshapes.three_dimensional_shapes;

import udemy.oop_part_one.geometricshapes.two_dim_shapes.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return this.getArea() * this.height;
    }
}
