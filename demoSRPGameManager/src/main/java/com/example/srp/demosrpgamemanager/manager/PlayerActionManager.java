package com.example.srp.demosrpgamemanager.manager;

import com.example.srp.demosrpgamemanager.model.ActionPlayer;
import com.example.srp.demosrpgamemanager.model.Player;
import org.springframework.stereotype.Component;

@Component
// manager has the responsibility to set an action on the player.
public class PlayerActionManager {

    public void move(Player player) {
        player.setActionPlayer(new ActionPlayer(("MOVE")));
    }

    public void fire(Player player) {
        player.setActionPlayer(new ActionPlayer(("FIRE")));
    }

    public void rest(Player player) {
        player.setActionPlayer(new ActionPlayer(("REST")));
    }
}
