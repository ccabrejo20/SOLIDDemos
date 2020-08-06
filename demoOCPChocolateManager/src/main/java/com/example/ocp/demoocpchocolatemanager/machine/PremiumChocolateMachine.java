package com.example.ocp.demoocpchocolatemanager.machine;

import com.example.ocp.demoocpchocolatemanager.model.Chocolate;
import com.example.ocp.demoocpchocolatemanager.model.ChocolateSelection;
import org.springframework.stereotype.Service;

@Service("PremiumChocolateMachine")
public class PremiumChocolateMachine implements ChocolateMachine {

    @Override
    public Chocolate brewChocolate(ChocolateSelection selection) {
        switch (selection) {
            case COCOA_CHOCOLATE:
                return brewCocoaChocolate();
            case DARK_CHOCOLATE:
                return brewDarkChocolate();
            default:
                return new Chocolate("Empty chocolate, please select a valid chocolate");
        }
    }

    public Chocolate brewCocoaChocolate() {
        return new Chocolate("Cocoa Chocolate");
    }

    public Chocolate brewDarkChocolate() {
        return new Chocolate("Dark Chocolate");
    }
}
