package com.example.isp.demoispbehaviormanager.quackcomponents;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "<< Silence >>";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
