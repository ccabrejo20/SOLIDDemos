package com.example.ocp.demoocpchocolatemanager.resource;

import com.example.ocp.demoocpchocolatemanager.model.Chocolate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChocolateResponse {
    private Chocolate chocolate;
}
