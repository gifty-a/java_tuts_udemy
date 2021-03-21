package udemy.oop_part_two.encapsulation.challenge_one;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <=100) this.tonerLevel = tonerLevel;
        else this.tonerLevel = -1;
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillToner(int amountOfToner){
        if (amountOfToner > 0 && amountOfToner <= 100) {
            if (this.tonerLevel + amountOfToner < 100) {
                this.tonerLevel += amountOfToner;
                return this.tonerLevel;
            }
            else return -1;
        }
        else return -1;
    }

    public int printPage(int pages){
        int pagesToPrint = pages;
        if (this.duplexPrinter){
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("This is a duplex printer");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
