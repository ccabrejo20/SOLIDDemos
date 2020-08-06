package com.example.dip.demodippizzamanager.pizzas;

import com.example.dip.demodippizzamanager.ingredients.Cheese;
import com.example.dip.demodippizzamanager.ingredients.Clams;
import com.example.dip.demodippizzamanager.ingredients.Dough;
import com.example.dip.demodippizzamanager.ingredients.Pepperoni;
import com.example.dip.demodippizzamanager.ingredients.Sauce;
import com.example.dip.demodippizzamanager.ingredients.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

