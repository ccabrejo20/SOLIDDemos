package com.example.ocp.demoocpchocolatemanager.machine;

import com.example.ocp.demoocpchocolatemanager.model.Chocolate;
import com.example.ocp.demoocpchocolatemanager.model.ChocolateSelection;

public interface ChocolateMachine {

    public Chocolate brewChocolate(ChocolateSelection chocolateSelection);

}
