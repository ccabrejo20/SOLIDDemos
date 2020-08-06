package com.example.isp.demoispbehaviormanager.client.animals;

import com.example.isp.demoispbehaviormanager.flycomponents.FlyNoWay;
import com.example.isp.demoispbehaviormanager.quackcomponents.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public String display() {
        return "I’m a rubber duck";
    }
}
