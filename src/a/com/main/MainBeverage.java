package a.com.main;

import a.com.cafeteria.addition.Mocha;
import a.com.cafeteria.addition.Soy;
import a.com.cafeteria.addition.Whip;
import a.com.cafeteria.beverage.DarkRoast;
import a.com.cafeteria.beverage.Espresso;
import a.com.cafeteria.beverage.HouseBlend;
import a.com.cafeteria.beverage.Beverage;

public class MainBeverage {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() +  " $" + beverage3.cost());
    }
}
