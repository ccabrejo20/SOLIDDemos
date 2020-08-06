package com.example.ocp.demolspbeveragemanager.coffeetype;

import com.example.ocp.demolspbeveragemanager.coffeecomponent.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .78;
    }
}
