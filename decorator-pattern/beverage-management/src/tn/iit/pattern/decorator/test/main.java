package tn.iit.pattern.decorator.test;

import tn.iit.pattern.decorator.beverages.Beverage;
import tn.iit.pattern.decorator.beverages.Coffee;
import tn.iit.pattern.decorator.beverages.Tea;
import tn.iit.pattern.decorator.condiments.Milk;
import tn.iit.pattern.decorator.condiments.Mint;
import tn.iit.pattern.decorator.condiments.Pine;
import tn.iit.pattern.decorator.condiments.Whip;

public class main {
    public static void main(String[] args) {

        Beverage b = new Tea();
        b = new Mint(b);
        b = new Mint(b);
        b = new Pine(b);
        System.out.println(b.getDescription());
        System.out.println("total : \t"+  b.cost());
        System.out.println("-----");

        Beverage b1 = new Coffee();
        b1 = new Milk(b1);

        b1 = new Mint(b1);
        System.out.println(b1.getDescription());
        System.out.println(b1.cost());
    }
}
