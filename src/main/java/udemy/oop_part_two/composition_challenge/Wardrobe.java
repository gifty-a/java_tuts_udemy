package udemy.oop_part_two.composition_challenge;

public class Wardrobe {
    private String material;
    private int numberOfCompartments;
    private boolean hasMirror;
    public Wardrobe(String material, int numberOfCompartments, boolean hasMirror) {
        this.material = material;
        this.numberOfCompartments = numberOfCompartments;
        this.hasMirror = hasMirror;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public boolean isHasMirror() {
        return hasMirror;
    }
}
