package com.vedruna.football.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.football.dto.PlayerHasTrophyDTO;
import com.vedruna.football.persistance.models.Player;
import com.vedruna.football.persistance.models.PlayerHasTrophy;
import com.vedruna.football.persistance.models.Trophie;
import com.vedruna.football.services.PlayerHasTrophyServiceImpI;
import com.vedruna.football.services.PlayerServiceImpI;
import com.vedruna.football.services.TrophieServiceImpI;

@RestController
@RequestMapping("/api/v1/playerHasTrophy")
public class PlayerHasTrophyController {
	
	@Autowired
	PlayerHasTrophyServiceImpI playerHasTrophyServiceImpI;
	
	
	@Autowired
	PlayerServiceImpI playerService;
	
	@Autowired
	TrophieServiceImpI trophieService;
	
	@PostMapping()
	public void newPlayerHasTrophy(@RequestBody PlayerHasTrophyDTO playerHasTrophy) {
		
		Player player = playerService.getPlayerById(playerHasTrophy.getPlayerId());
		Trophie trophy = trophieService.findTrophieByID(playerHasTrophy.getTrophieId());
		
		
		PlayerHasTrophy newPlayerHasTrophy = new PlayerHasTrophy();
	    newPlayerHasTrophy.setPlayer(player);
	    newPlayerHasTrophy.setTrophie(trophy);
			
		playerHasTrophyServiceImpI.addPlayerHasTrophy(newPlayerHasTrophy);
		
		
	}
	

}
