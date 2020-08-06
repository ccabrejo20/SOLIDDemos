package com.example.srp.demosrpgamemanager.webservice;

import com.example.srp.demosrpgamemanager.manager.PlayerActionManager;
import com.example.srp.demosrpgamemanager.model.Player;
import com.example.srp.demosrpgamemanager.resource.ActionRequest;
import com.example.srp.demosrpgamemanager.resource.ActionResponse;
import com.example.srp.demosrpgamemanager.resource.SessionResponse;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerActionController {

    @Autowired
    private PlayerActionManager playerActionManager;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = SessionResponse.class)
    })
    @PostMapping(value = "/move", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ActionResponse move(@RequestBody ActionRequest actionRequest) {

        Player player = actionRequest.getPlayer();
        playerActionManager.move(player);
        return new ActionResponse(player);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = SessionResponse.class)
    })
    @PostMapping(value = "/fire", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ActionResponse fire(@RequestBody ActionRequest actionRequest) {
        Player player = actionRequest.getPlayer();
        playerActionManager.fire(player);
        return new ActionResponse(player);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = SessionResponse.class)
    })
    @PostMapping(value = "/rest", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ActionResponse rest(@RequestBody ActionRequest actionRequest) {
        Player player = actionRequest.getPlayer();
        playerActionManager.rest(player);
        return new ActionResponse(player);
    }

}
