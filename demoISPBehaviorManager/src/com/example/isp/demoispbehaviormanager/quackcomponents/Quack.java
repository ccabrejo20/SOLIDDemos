package com.example.isp.demoispbehaviormanager.quackcomponents;

public class Quack implements QuackBehavior {

    @Override
    public String quack() {
        return "Quack";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
