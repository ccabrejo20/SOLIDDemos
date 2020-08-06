package com.example.isp.demoispbehaviormanager.quackcomponents;

public class Squeak implements QuackBehavior {
    public String quack() {
        return "Squeak";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
