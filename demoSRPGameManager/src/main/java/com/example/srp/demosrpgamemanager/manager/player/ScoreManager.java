package com.example.srp.demosrpgamemanager.manager.player;

import com.example.srp.demosrpgamemanager.model.Player;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
// Manager has the responsibility to get the scores from the player
public class ScoreManager {

    public long getHighScore(Player player) {
        player.setHighScore(new Random().nextLong());
        return player.getHighScore();
    }
}
