package com.example.isp.demoispbehaviormanager.flycomponents;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "I can’t ﬂy";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
