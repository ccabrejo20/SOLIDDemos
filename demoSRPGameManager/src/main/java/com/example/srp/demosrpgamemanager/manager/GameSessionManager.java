package com.example.srp.demosrpgamemanager.manager;

import com.example.srp.demosrpgamemanager.model.Player;
import com.example.srp.demosrpgamemanager.model.SessionPlayer;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
// Manager has the responsibility to login/sign up the player.
public class GameSessionManager {

    public void login(Player player) {
        player.setSessionPlayer(new SessionPlayer(UUID.randomUUID().toString()));
    }

    public void signUp(Player player) {
        player.setSessionPlayer(new SessionPlayer(UUID.randomUUID().toString()));
    }
}
