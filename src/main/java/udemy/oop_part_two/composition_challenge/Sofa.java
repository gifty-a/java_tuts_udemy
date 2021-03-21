package udemy.oop_part_two.composition_challenge;

public class Sofa {
    private String sofaType;
    private int numOfSeats;

    public Sofa(String sofaType, int numOfSeats) {
        this.sofaType = sofaType;
        this.numOfSeats = numOfSeats;
    }

    public String getSofaType() {
        return sofaType;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }
}
