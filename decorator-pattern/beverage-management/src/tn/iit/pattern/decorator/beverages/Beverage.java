package tn.iit.pattern.decorator.beverages;

public abstract class Beverage {
    protected final String description;
    protected float price;

    protected Beverage(String description, float cost) {
        this.description = description;
        this.price = cost;
    }

    public String getDescription() {
        return description + "\t\t\t" + price;
    }

    public float cost() {
        return price;
    }
}
