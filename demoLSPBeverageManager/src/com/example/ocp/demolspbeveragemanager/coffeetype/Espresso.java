package com.example.ocp.demolspbeveragemanager.coffeetype;

import com.example.ocp.demolspbeveragemanager.coffeecomponent.Beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

