package com.vedruna.football.dto;

import java.util.ArrayList;
import java.util.List;

import com.vedruna.football.persistance.models.Player;
import com.vedruna.football.persistance.models.Trophie;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PlayerDTO {
	
	private int idPlayer;
	private String username;
	private List<TrophieDTO> trophiesPlayer;
	
	public PlayerDTO(Player player) {
		this.idPlayer = player.getIdplayer();
		this.username = player.getUsername();
		this.trophiesPlayer =new ArrayList<>();
		
		for (Trophie trophiePlayer : player.getTrophiesHasPlayer()) {
			TrophieDTO trophyDTO = new TrophieDTO(trophiePlayer);
			this.trophiesPlayer.add(trophyDTO);
			
		}
	}

}
