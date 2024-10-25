package com.vedruna.football.services;

import java.util.List;

import com.vedruna.football.dto.TrophieDTO;

public interface TrophieServiceI {
	
	List<TrophieDTO> getAllTrophies();
	void addTrophy (TrophieDTO trophie);

}
