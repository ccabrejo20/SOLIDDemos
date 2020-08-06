package com.example.ocp.demolspbeveragemanager;

import com.example.ocp.demolspbeveragemanager.coffeecomponent.Beverage;
import com.example.ocp.demolspbeveragemanager.coffeetype.DarkRoast;
import com.example.ocp.demolspbeveragemanager.coffeetype.Espresso;
import com.example.ocp.demolspbeveragemanager.coffeetype.HouseBlend;

import java.util.ArrayList;
import java.util.List;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        List<Beverage> beverages = new ArrayList<>();
        beverages.add(new Espresso());
        beverages.add(new DarkRoast());
        beverages.add(new HouseBlend());

        printBeverageInfo(beverages);
    }

    public static void printBeverageInfo(List<Beverage> beverages) {
        beverages.stream().forEach(beverage -> System.out.println(beverage.getDescription() + " $" + beverage.cost()));
    }


}
