package com.example.dip.demodippizzamanager.factories;

import com.example.dip.demodippizzamanager.ingredients.Cheese;
import com.example.dip.demodippizzamanager.ingredients.Clams;
import com.example.dip.demodippizzamanager.ingredients.Dough;
import com.example.dip.demodippizzamanager.ingredients.Pepperoni;
import com.example.dip.demodippizzamanager.ingredients.Sauce;
import com.example.dip.demodippizzamanager.ingredients.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}

