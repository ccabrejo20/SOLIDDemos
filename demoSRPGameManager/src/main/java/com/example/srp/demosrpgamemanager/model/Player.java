package com.example.srp.demosrpgamemanager.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
// This class has the responsibility to contain the info related with player.
public class Player {

    private String id;

    private String name;

    private long highScore;

    private ActionPlayer actionPlayer;

    private SessionPlayer sessionPlayer;

}
