package com.example.isp.demoispbehaviormanager.client.animals;

import com.example.isp.demoispbehaviormanager.flycomponents.FlyNoWay;
import com.example.isp.demoispbehaviormanager.quackcomponents.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "I’m a model duck";
    }
}
