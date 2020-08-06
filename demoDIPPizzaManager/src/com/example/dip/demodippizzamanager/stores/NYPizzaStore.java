package com.example.dip.demodippizzamanager.stores;

import com.example.dip.demodippizzamanager.factories.NYPizzaIngredientFactory;
import com.example.dip.demodippizzamanager.factories.PizzaIngredientFactory;
import com.example.dip.demodippizzamanager.pizzas.CheesePizza;
import com.example.dip.demodippizzamanager.pizzas.ClamPizza;
import com.example.dip.demodippizzamanager.pizzas.PepperoniPizza;
import com.example.dip.demodippizzamanager.pizzas.Pizza;
import com.example.dip.demodippizzamanager.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}
