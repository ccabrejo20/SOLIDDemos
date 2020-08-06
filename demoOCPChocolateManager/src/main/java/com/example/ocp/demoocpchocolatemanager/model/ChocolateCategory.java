package com.example.ocp.demoocpchocolatemanager.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
// This class has the responsibility to contain the info related with player.
public enum ChocolateCategory {
    PREMIUM("Premium"),
    BASIC("Basic");

    private String identifier;

    ChocolateCategory(String name) {
        this.identifier = name;
    }

    public String getIdentifier() {
        return identifier;
    }
}
