package udemy.oop_part_two.composition;

public class Computer {
    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public Computer(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp(){
        pcCase.pressPowerBtn();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelArt(2, 2,"pink");
    }
//
//    public Case getPcCase() {
//        return pcCase;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
}
