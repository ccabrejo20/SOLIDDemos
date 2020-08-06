package com.example.ocp.demoocpchocolatemanager.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
// This class has the responsibility to contain the info related with player.
public enum ChocolateSelection {
    WHITE_CHOCOLATE,
    MILK_CHOCOLATE,
    DARK_CHOCOLATE,
    COCOA_CHOCOLATE;
}
