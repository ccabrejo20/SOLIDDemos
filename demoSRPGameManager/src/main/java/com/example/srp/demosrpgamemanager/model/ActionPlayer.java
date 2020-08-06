package com.example.srp.demosrpgamemanager.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
//This class has the responsibility to contain the info related with any action on the player.
public class ActionPlayer {

    private String action;

}
