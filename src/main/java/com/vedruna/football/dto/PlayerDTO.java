package com.vedruna.football.dto;

import java.util.ArrayList;
import java.util.List;

import com.vedruna.football.persistance.models.Player;
import com.vedruna.football.persistance.models.PlayerHasTrophy;
import com.vedruna.football.persistance.models.Trophie;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PlayerDTO {
	
	private int idPlayer;
	private String username;
	private List<TrophieDTO> trophiesDTO;
	
	public PlayerDTO(Player player) {
		this.idPlayer = player.getIdplayer();
		this.username = player.getUsername();
		this.trophiesDTO = new ArrayList<>();
		
		for(PlayerHasTrophy playerTrophie : player.getPlayerHasTrophies()) {
			Trophie trophy = playerTrophie.getTrophie();
			TrophieDTO trophyDTO = new TrophieDTO();
			trophyDTO.setIdTrophy(trophy.getIdtrophie());
			trophyDTO.setTitle(trophy.getTitle());
			trophyDTO.setDescription(trophy.getDescription());
			this.trophiesDTO.add(trophyDTO);
			
		}
		
	}

}
