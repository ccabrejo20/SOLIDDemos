package com.example.ocp.demoocpchocolatemanager.manager;

import com.example.ocp.demoocpchocolatemanager.machine.ChocolateMachine;
import com.example.ocp.demoocpchocolatemanager.model.Chocolate;
import com.example.ocp.demoocpchocolatemanager.model.ChocolateCategory;
import com.example.ocp.demoocpchocolatemanager.model.ChocolateSelection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// Manager has the responsibility to login/sign up the player.
public class ChocolateManager {

    private static final String SERVICE_NAME_SUFFIX = "ChocolateMachine";
    private ChocolateMachine chocolateMachine;

    @Autowired
    private BeanFactory beanFactory;

    public Chocolate brewChocolate(ChocolateCategory chocolateCategory, ChocolateSelection chocolateSelection) {

        chocolateMachine = beanFactory.getBean(chocolateCategory.getIdentifier() + SERVICE_NAME_SUFFIX, ChocolateMachine.class);

        return chocolateMachine.brewChocolate(chocolateSelection);
    }

}
