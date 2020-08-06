package com.example.ocp.demoocpchocolatemanager.resource;

import com.example.ocp.demoocpchocolatemanager.model.ChocolateCategory;
import com.example.ocp.demoocpchocolatemanager.model.ChocolateSelection;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChocolateRequest {

    private ChocolateCategory chocolateCategory;
    private ChocolateSelection chocolateSelection;
}
