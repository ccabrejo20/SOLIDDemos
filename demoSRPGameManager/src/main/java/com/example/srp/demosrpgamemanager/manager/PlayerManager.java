package com.example.srp.demosrpgamemanager.manager;

import com.example.srp.demosrpgamemanager.model.Player;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
// manager has the responsibility to gey any property from the player
public class PlayerManager {

    public long getHighScore(Player player) {
        player.setHighScore(new Random().nextLong());
        return player.getHighScore();
    }

    public String getName(Player player) {
        player.setName("RandomName");
        return player.getName();
    }
}
