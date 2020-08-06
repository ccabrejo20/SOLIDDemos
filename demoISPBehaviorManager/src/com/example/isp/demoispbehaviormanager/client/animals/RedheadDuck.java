package com.example.isp.demoispbehaviormanager.client.animals;

import com.example.isp.demoispbehaviormanager.flycomponents.FlyWithWings;
import com.example.isp.demoispbehaviormanager.quackcomponents.Squeak;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public String display() {
        return "I’m a red head duck";
    }
}
