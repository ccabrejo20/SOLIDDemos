package com.example.srp.demosrpgamemanager.manager.action;

import com.example.srp.demosrpgamemanager.model.ActionPlayer;
import com.example.srp.demosrpgamemanager.model.Player;
import org.springframework.stereotype.Component;

@Component
// Has the responsibility to set an action on the player (FIRE).
public class FireManager {

    public void fire(Player player) {
        player.setActionPlayer(new ActionPlayer(("FIRE")));
    }

}
