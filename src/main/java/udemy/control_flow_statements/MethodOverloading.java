package udemy.control_flow_statements;

public class MethodOverloading {
    public double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeter = 0;
        if(feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        double feetCm = feet * 30.48;
        double inchesCm = inches * 2.54;
        centimeter = (int) (feetCm + inchesCm);
        return centimeter;
    }
    public double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double centimeter = inches * 2.54;
        return centimeter;
    }
}
