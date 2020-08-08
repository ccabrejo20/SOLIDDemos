package com.example.srp.demosrpgamemanager.manager.player;

import com.example.srp.demosrpgamemanager.model.Player;
import org.springframework.stereotype.Component;

@Component
// manager has the responsibility to get the name from the player
public class NameManager {

    public String getName(Player player) {
        player.setName("RandomName");
        return player.getName();
    }
}
