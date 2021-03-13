package udemy.oop_part_one;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Albert", 98.00, "albert@gmail.com");
    }
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "oopse@gmail.com");
    }
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }
    public double getCreditLimit() {
        return this.creditLimit;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
}
