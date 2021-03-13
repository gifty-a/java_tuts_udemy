package udemy.oop_part_one;

public class Point {
    private int x,y;

    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(Math.pow((this.x - 0), 2) + Math.pow((this.y - 0), 2));
    }
    public double distance(int originX, int originY){
        return Math.sqrt(Math.pow((this.x - originX), 2) + Math.pow((this.y - originY), 2));
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }
}
