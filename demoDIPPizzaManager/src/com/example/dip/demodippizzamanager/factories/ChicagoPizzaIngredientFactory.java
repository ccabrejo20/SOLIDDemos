package com.example.dip.demodippizzamanager.factories;

import com.example.dip.demodippizzamanager.ingredients.BlackOlives;
import com.example.dip.demodippizzamanager.ingredients.Cheese;
import com.example.dip.demodippizzamanager.ingredients.Clams;
import com.example.dip.demodippizzamanager.ingredients.Dough;
import com.example.dip.demodippizzamanager.ingredients.Eggplant;
import com.example.dip.demodippizzamanager.ingredients.FrozenClams;
import com.example.dip.demodippizzamanager.ingredients.MozzarellaCheese;
import com.example.dip.demodippizzamanager.ingredients.Pepperoni;
import com.example.dip.demodippizzamanager.ingredients.PlumTomatoSauce;
import com.example.dip.demodippizzamanager.ingredients.Sauce;
import com.example.dip.demodippizzamanager.ingredients.SlicedPepperoni;
import com.example.dip.demodippizzamanager.ingredients.Spinach;
import com.example.dip.demodippizzamanager.ingredients.ThickCrustDough;
import com.example.dip.demodippizzamanager.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}

