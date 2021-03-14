package udemy.oop_part_one.geometricshapes.three_dimensional_shapes;

import udemy.oop_part_one.geometricshapes.two_dim_shapes.Rectangle;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0? 0 : height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return this.getArea() * this.height;
    }
}
