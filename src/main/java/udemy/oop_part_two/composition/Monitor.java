package udemy.oop_part_two.composition;

public class Monitor {
    private String model, manufacturer;
    private int size;
    private Resolution nativeRes;

    public Monitor(String model, String manufacturer, int size, Resolution nativeRes) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeRes = nativeRes;
    }

    public void drawPixelArt(int x, int y, String color){
        System.out.println("Drawing Pixe art at " + x + ","+ y + " in color "+ color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeRes() {
        return nativeRes;
    }
}
