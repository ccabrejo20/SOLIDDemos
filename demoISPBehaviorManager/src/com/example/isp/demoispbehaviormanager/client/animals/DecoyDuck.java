package com.example.isp.demoispbehaviormanager.client.animals;

import com.example.isp.demoispbehaviormanager.flycomponents.FlyNoWay;
import com.example.isp.demoispbehaviormanager.quackcomponents.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public String display() {
        return "I’m a decoy duck";
    }
}
