package udemy.oop_part_two.composition;

public class Motherboard {
    private String model, manufacturer, cardSlots;
    private int ramSlots, bios;

    public Motherboard(String model, String manufacturer, int bios, int ramSlots, String cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getBios() {
        return bios;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getCardSlots() {
        return cardSlots;
    }

    public void loadProgram(String programName){
        System.out.println(programName + " is loading");
    }
}
