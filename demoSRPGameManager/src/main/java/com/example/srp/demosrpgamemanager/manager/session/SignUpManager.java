package com.example.srp.demosrpgamemanager.manager.session;

import com.example.srp.demosrpgamemanager.model.Player;
import com.example.srp.demosrpgamemanager.model.SessionPlayer;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
// This manager has the responsibility to sign up the player.
public class SignUpManager {

    public void signUp(Player player) {
        player.setSessionPlayer(new SessionPlayer(UUID.randomUUID().toString()));
    }
}
