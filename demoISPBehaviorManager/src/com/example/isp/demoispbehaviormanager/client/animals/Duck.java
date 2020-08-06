package com.example.isp.demoispbehaviormanager.client.animals;

import com.example.isp.demoispbehaviormanager.flycomponents.FlyBehavior;
import com.example.isp.demoispbehaviormanager.quackcomponents.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract String display();

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return "All ducks flooat, even decoys!";
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
