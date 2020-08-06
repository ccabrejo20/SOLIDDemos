package com.example.srp.demosrpgamemanager.resource;

import com.example.srp.demosrpgamemanager.model.Player;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SessionResponse {
    private Player player;
}
