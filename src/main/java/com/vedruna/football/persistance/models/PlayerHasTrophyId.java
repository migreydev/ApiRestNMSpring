package com.vedruna.football.persistance.models;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PlayerHasTrophyId implements Serializable {
	
	  private int player;
	  private int trophie;

}
