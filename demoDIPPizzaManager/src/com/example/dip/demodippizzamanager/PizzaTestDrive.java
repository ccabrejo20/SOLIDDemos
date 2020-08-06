package com.example.dip.demodippizzamanager;

import com.example.dip.demodippizzamanager.pizzas.Pizza;
import com.example.dip.demodippizzamanager.stores.ChicagoPizzaStore;
import com.example.dip.demodippizzamanager.stores.NYPizzaStore;
import com.example.dip.demodippizzamanager.stores.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}

