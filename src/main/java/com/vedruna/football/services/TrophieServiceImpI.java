package com.vedruna.football.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.TrophieDTO;
import com.vedruna.football.persistance.models.Trophie;
import com.vedruna.football.persistance.repository.PlayerRepository;
import com.vedruna.football.persistance.repository.TrophieRepository;

@Service
public class TrophieServiceImpI implements TrophieServiceI{
	
	@Autowired
	TrophieRepository trophieRepository;
	
	@Autowired
	PlayerRepository playerRepository;

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
		Trophie newTrophie = new Trophie(trophie);
		newTrophie.setPlayerHasTrophies(null);
		
		trophieRepository.save(newTrophie);
		
	}


	@Override
	public Trophie findTrophieBytitle(String title) {
		
		return trophieRepository.findTrophieBytitle(title);
	}

	@Override
	public TrophieDTO findTrophieDTOBytitle(String title) {
		
		TrophieDTO trophieDTO = new TrophieDTO(trophieRepository.findTrophieBytitle(title));
		return trophieDTO;
	}

	@Override
	public Trophie findTrophieByID(int id) {
		return trophieRepository.findTrophieByidtrophie(id);
	}
	
	

}
