package udemy.oop_part_two.composition_challenge;

public class Bed {
    private Size size;
    private String frameType;
    private String mattressType;
    private int numberOfPillows;
    private boolean hasBlanket, hasBedsheet;

    public Bed(Size size, String frameType, String mattressType, int numberOfPillows, boolean hasBlanket, boolean hasBedsheet) {
        this.size = size;
        this.frameType = frameType;
        this.mattressType = mattressType;
        this.numberOfPillows = numberOfPillows;
        this.hasBlanket = hasBlanket;
        this.hasBedsheet = hasBedsheet;
    }

    public Size getSize() {
        return size;
    }

    public String getFrameType() {
        return frameType;
    }

    public String getMattressType() {
        return mattressType;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public boolean isHasBlanket() {
        return hasBlanket;
    }

    public boolean isHasBedsheet() {
        return hasBedsheet;
    }
}

