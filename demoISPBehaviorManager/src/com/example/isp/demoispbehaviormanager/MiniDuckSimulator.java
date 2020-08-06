package com.example.isp.demoispbehaviormanager;

import com.example.isp.demoispbehaviormanager.client.animals.Duck;
import com.example.isp.demoispbehaviormanager.flycomponents.FlyRocketPowered;
import com.example.isp.demoispbehaviormanager.client.animals.MallardDuck;
import com.example.isp.demoispbehaviormanager.client.animals.ModelDuck;
import com.example.isp.demoispbehaviormanager.ui.DuckSimulator;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
