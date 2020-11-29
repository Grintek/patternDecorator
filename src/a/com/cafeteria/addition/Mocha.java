package a.com.cafeteria.addition;

import a.com.cafeteria.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        if(beverage.getSize() == Size.TALL) {
            return .20 + beverage.cost();
        }
        return cost();
    }
}
