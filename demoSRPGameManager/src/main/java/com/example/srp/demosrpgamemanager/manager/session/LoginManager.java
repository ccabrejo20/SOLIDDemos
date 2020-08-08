package com.example.srp.demosrpgamemanager.manager.session;

import com.example.srp.demosrpgamemanager.model.Player;
import com.example.srp.demosrpgamemanager.model.SessionPlayer;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
// This manager has the responsibility to login the player.
public class LoginManager {

    public void login(Player player) {
        player.setSessionPlayer(new SessionPlayer(UUID.randomUUID().toString()));
    }

}
