package tn.iit.factory.pattern.test;

import tn.iit.factory.pattern.stores.PizzaStore;
import tn.iit.factory.pattern.stores.SfaxPizzaStore;
import tn.iit.factory.pattern.stores.TunisStylePizzaStore;

public class main {
    public static void main(String[] args) {
        PizzaStore sfaxps = new SfaxPizzaStore();
        sfaxps.orderPizza("cheese");

        System.out.println("-------------------------------");
        PizzaStore tunps = new TunisStylePizzaStore();
        tunps.orderPizza("clam");
    }
}
