package com.example.isp.demoispbehaviormanager.flycomponents;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        return "I’m fling!!";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
