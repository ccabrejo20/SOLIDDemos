package com.example.srp.demosrpgamemanager.webservice;

import com.example.srp.demosrpgamemanager.manager.PlayerManager;
import com.example.srp.demosrpgamemanager.model.Player;
import com.example.srp.demosrpgamemanager.resource.PlayerResponse;
import com.example.srp.demosrpgamemanager.resource.SessionResponse;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @Autowired
    private PlayerManager playerManager;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = SessionResponse.class)
    })
    @GetMapping(value = "/getHighScore/{playerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PlayerResponse getHighScore(@PathVariable String playerId) {
        Player player = Player.builder().id(playerId).build();
        return PlayerResponse.builder().highScore(playerManager.getHighScore(player)).build();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = SessionResponse.class)
    })
    @GetMapping(value = "/getName/{playerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PlayerResponse getName(@PathVariable String playerId) {
        Player player = Player.builder().id(playerId).build();
        return PlayerResponse.builder().name(playerManager.getName(player)).build();
    }

}
