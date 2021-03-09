package udemy;

public class AreaCalculator {
    private static final double INVALID_NUMBER = -1;
    private double area(double radius){
        if (radius < 0){
            return INVALID_NUMBER;
        }
        return Math.PI * Math.pow(radius, 2);
    }
    private double area(double x, double y){
        if (x < 0 || y < 0){
            return INVALID_NUMBER;
        }
        return x * y;
    }

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.area(5.0));
        System.out.println(areaCalculator.area(-1));
        System.out.println(areaCalculator.area(5.0,4.0));
        System.out.println(areaCalculator.area(-1.0,4.0));
    }
}
