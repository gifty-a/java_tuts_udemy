package udemy.oop_part_one.geometricshapes.two_dim_shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
