package com.example.ocp.demolspbeveragemanager.coffeetype;

import com.example.ocp.demolspbeveragemanager.coffeecomponent.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
