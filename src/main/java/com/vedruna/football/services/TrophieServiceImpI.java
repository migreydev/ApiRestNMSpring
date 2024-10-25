package com.vedruna.football.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.TrophieDTO;
import com.vedruna.football.persistance.models.Trophie;
import com.vedruna.football.persistance.repository.TrophieRepository;

@Service
public class TrophieServiceImpI implements TrophieServiceI{
	
	@Autowired
	TrophieRepository trophieRepository;

	@Override
	public List<TrophieDTO> getAllTrophies() {
		List<Trophie> trophies = trophieRepository.findAll();
		List<TrophieDTO> trophiesDTO = new ArrayList<>();
		
		for(Trophie trophie : trophies) {
			trophiesDTO.add(new TrophieDTO(trophie));
		}
		return trophiesDTO;
	}

	@Override
	public void addTrophy(TrophieDTO trophie) {
		Trophie newTrophie = new Trophie();
		
		newTrophie.setIdtrophie(trophie.getIdTrophy());
		newTrophie.setTitle(trophie.getTitle());
		newTrophie.setDescription(trophie.getDescription());
		newTrophie.setPlayerHasTrophies(null);
		
		trophieRepository.save(newTrophie);
		
	}

}
