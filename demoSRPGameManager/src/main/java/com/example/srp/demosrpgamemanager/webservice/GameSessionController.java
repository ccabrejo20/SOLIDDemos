package com.example.srp.demosrpgamemanager.webservice;

import com.example.srp.demosrpgamemanager.manager.session.LoginManager;
import com.example.srp.demosrpgamemanager.manager.session.SignUpManager;
import com.example.srp.demosrpgamemanager.model.Player;
import com.example.srp.demosrpgamemanager.resource.SessionRequest;
import com.example.srp.demosrpgamemanager.resource.SessionResponse;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameSessionController {

    @Autowired
    private LoginManager loginManager;

    @Autowired
    private SignUpManager signUpManager;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = SessionResponse.class)
    })
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public SessionResponse login(@RequestBody SessionRequest sessionRequest) {
        Player player = sessionRequest.getPlayer();
        loginManager.login(player);
        return new SessionResponse(player);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful response", response = SessionResponse.class)
    })
    @PostMapping(value = "/signUp", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public SessionResponse signUp(@RequestBody SessionRequest sessionRequest) {
        Player player = sessionRequest.getPlayer();
        signUpManager.signUp(player);
        return new SessionResponse(player);
    }


}
