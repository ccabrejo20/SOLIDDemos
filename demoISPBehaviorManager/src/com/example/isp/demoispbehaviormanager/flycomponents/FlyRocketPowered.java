package com.example.isp.demoispbehaviormanager.flycomponents;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public String fly() {
        return "I’m ﬂying with a rocket!";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
