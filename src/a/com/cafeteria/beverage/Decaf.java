package a.com.cafeteria.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "decaffeinated coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
