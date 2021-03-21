package udemy.oop_part_two.bills_burgers;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy burger", meat, "Honeywheat Bread", price);
    }

    public void addHealthyExtra1Name(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyExtra2Name(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamBurgerOrder() {
        System.out.println("One order of " + this.getName() + " on " + this.getBreadRollType() + " with " + healthyExtra1Name + " " + healthyExtra2Name);
        return super.itemizeHamBurgerOrder() + healthyExtra1Price + healthyExtra2Price;
    }
}
