package com.vedruna.football.services;

import java.util.List;

import com.vedruna.football.dto.TrophieDTO;
import com.vedruna.football.persistance.models.Trophie;

public interface TrophieServiceI {
	
	List<TrophieDTO> getAllTrophies();
	void addTrophy (TrophieDTO trophie);
	Trophie findTrophieBytitle(String title);
	TrophieDTO findTrophieDTOBytitle(String title);
	Trophie findTrophieByID(int id);

}
