package tn.iit.factory.pattern.stores;

import tn.iit.factory.pattern.pizzas.Pizza;
import tn.iit.factory.pattern.pizzas.TunisStyleCheesePizza;
import tn.iit.factory.pattern.pizzas.TunisStyleClamPizza;
import tn.iit.factory.pattern.pizzas.TunisStylePepperoniPizza;

public class TunisStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = new TunisStyleCheesePizza();
        }
        if ("pepperoni".equals(type)){
            pizza = new TunisStylePepperoniPizza();
        }
        if ("clam".equals(type)){
            pizza = new TunisStyleClamPizza();
        }
        return pizza;
    }
}
