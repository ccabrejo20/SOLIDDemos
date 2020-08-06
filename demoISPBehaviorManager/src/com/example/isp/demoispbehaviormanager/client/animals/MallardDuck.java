package com.example.isp.demoispbehaviormanager.client.animals;

import com.example.isp.demoispbehaviormanager.flycomponents.FlyWithWings;
import com.example.isp.demoispbehaviormanager.quackcomponents.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return  "I’m a real Mallard duck";
    }
}
