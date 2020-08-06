package com.example.dip.demodippizzamanager.stores;

import com.example.dip.demodippizzamanager.factories.ChicagoPizzaIngredientFactory;
import com.example.dip.demodippizzamanager.factories.PizzaIngredientFactory;
import com.example.dip.demodippizzamanager.pizzas.CheesePizza;
import com.example.dip.demodippizzamanager.pizzas.ClamPizza;
import com.example.dip.demodippizzamanager.pizzas.PepperoniPizza;
import com.example.dip.demodippizzamanager.pizzas.Pizza;
import com.example.dip.demodippizzamanager.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}

