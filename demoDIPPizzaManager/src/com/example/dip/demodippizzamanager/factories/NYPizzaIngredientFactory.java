package com.example.dip.demodippizzamanager.factories;

import com.example.dip.demodippizzamanager.ingredients.Cheese;
import com.example.dip.demodippizzamanager.ingredients.Clams;
import com.example.dip.demodippizzamanager.ingredients.Dough;
import com.example.dip.demodippizzamanager.ingredients.FreshClams;
import com.example.dip.demodippizzamanager.ingredients.Garlic;
import com.example.dip.demodippizzamanager.ingredients.MarinaraSauce;
import com.example.dip.demodippizzamanager.ingredients.Mushroom;
import com.example.dip.demodippizzamanager.ingredients.Onion;
import com.example.dip.demodippizzamanager.ingredients.Pepperoni;
import com.example.dip.demodippizzamanager.ingredients.RedPepper;
import com.example.dip.demodippizzamanager.ingredients.ReggianoCheese;
import com.example.dip.demodippizzamanager.ingredients.Sauce;
import com.example.dip.demodippizzamanager.ingredients.SlicedPepperoni;
import com.example.dip.demodippizzamanager.ingredients.ThinCrustDough;
import com.example.dip.demodippizzamanager.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}

