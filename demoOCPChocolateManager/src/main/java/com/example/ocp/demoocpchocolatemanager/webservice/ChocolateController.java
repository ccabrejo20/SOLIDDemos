package com.example.ocp.demoocpchocolatemanager.webservice;

import com.example.ocp.demoocpchocolatemanager.resource.ChocolateRequest;
import com.example.ocp.demoocpchocolatemanager.resource.ChocolateResponse;
import com.example.ocp.demoocpchocolatemanager.manager.ChocolateManager;
import com.example.ocp.demoocpchocolatemanager.model.Chocolate;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateManager chocolateManager;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = ChocolateResponse.class)
    })
    @PostMapping(value = "/brewChocolate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ChocolateResponse brewChocolate(@RequestBody ChocolateRequest chocolateRequest) {
        Chocolate chocolateResult = chocolateManager.brewChocolate(chocolateRequest.getChocolateCategory(), chocolateRequest.getChocolateSelection());
        return new ChocolateResponse(chocolateResult);
    }
}
