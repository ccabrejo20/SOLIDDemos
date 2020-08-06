package com.example.srp.demosrpgamemanager.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PlayerResponse {

    private String name;

    private long highScore;
}
