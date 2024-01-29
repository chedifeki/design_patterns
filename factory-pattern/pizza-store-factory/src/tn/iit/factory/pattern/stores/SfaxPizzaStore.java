package tn.iit.factory.pattern.stores;

import tn.iit.factory.pattern.pizzas.Pizza;
import tn.iit.factory.pattern.pizzas.SfaxStyleCheesePizza;
import tn.iit.factory.pattern.pizzas.SfaxStyleClamPizza;
import tn.iit.factory.pattern.pizzas.SfaxStylePepperoniPizza;

public class SfaxPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = new SfaxStyleCheesePizza();
        }
        if ("pepperoni".equals(type)){
            pizza = new SfaxStylePepperoniPizza();
        }
        if ("clam".equals(type)){
            pizza = new SfaxStyleClamPizza();
        }
        return pizza;
    }
}
