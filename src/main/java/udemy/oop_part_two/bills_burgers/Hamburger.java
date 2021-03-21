package udemy.oop_part_two.bills_burgers;

public class Hamburger {
    private String name, meat, breadRollType;
    private double price;

    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.price += price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.price += price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.price += price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.price += price;
    }

    public double itemizeHamBurgerOrder(){
        System.out.println("One order of " + this.name + " on " + this.breadRollType + " with " + this
        .addition1Name + " " + this.addition2Name + " " + this.addition3Name + " " + this.addition4Name);
        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
}
