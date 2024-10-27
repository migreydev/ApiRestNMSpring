package com.vedruna.football.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.persistance.models.PlayerHasTrophy;
import com.vedruna.football.persistance.repository.PlayerHasTrophyRepository;

@Service
public class PlayerHasTrophyServiceImpI implements PlayerHasTrophyServiceI{
	
	@Autowired
	PlayerHasTrophyRepository playerHasTrophyRepository;

	@Override
	public void addPlayerHasTrophy(PlayerHasTrophy playerHasTrophy) {
		playerHasTrophyRepository.save(playerHasTrophy);
		
	}

}
