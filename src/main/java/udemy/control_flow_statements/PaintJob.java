package udemy.control_flow_statements;

public class PaintJob {
    public int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) return -1;
        return (int)Math.ceil((getArea(width, height)-(areaPerBucket*extraBuckets))/ areaPerBucket);
    }
    private double getArea(double width, double height){
        return width * height;
    }
}
