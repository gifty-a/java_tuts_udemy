package udemy.oop_part_two.composition_challenge_three;

public class Ceiling {
    private int height;
    private String paintedColor;

    public Ceiling(int height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }
}
