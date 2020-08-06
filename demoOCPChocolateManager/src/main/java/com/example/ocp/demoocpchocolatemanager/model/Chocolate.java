package com.example.ocp.demoocpchocolatemanager.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
// This class has the responsibility to contain the info related with player.
public class Chocolate {

    private String description;

}
