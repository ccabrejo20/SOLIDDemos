package com.example.ocp.demoocpchocolatemanager.machine;

import com.example.ocp.demoocpchocolatemanager.model.Chocolate;
import com.example.ocp.demoocpchocolatemanager.model.ChocolateSelection;
import org.springframework.stereotype.Service;

@Service("BasicChocolateMachine")
public class BasicChocolateMachine implements ChocolateMachine {

    @Override
    public Chocolate brewChocolate(ChocolateSelection selection) {
        switch (selection) {
            case WHITE_CHOCOLATE:
                return brewWhiteChocolate();
            case MILK_CHOCOLATE:
                return brewMilkChocolate();
            default:
                return new Chocolate("Empty chocolate, please select a valid chocolate");
        }
    }

    public Chocolate brewWhiteChocolate() {
        return new Chocolate("White Chocolate");
    }

    public Chocolate brewMilkChocolate() {
        return new Chocolate("Milk Chocolate");
    }
}
