package udemy.oop_part_two.composition_challenge;

public class RoomDimensions {
    int width, height;
    private Unit unit;

    public RoomDimensions(int width, int height, Unit unit) {
        this.width = width;
        this.height = height;
        this.unit = unit;
    }
    public int getRoomDims(){
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Unit getUnit() {
        return unit;
    }
}
