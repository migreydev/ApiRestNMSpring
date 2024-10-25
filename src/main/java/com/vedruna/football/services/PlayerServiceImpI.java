package com.vedruna.football.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.PlayerDTO;
import com.vedruna.football.persistance.models.Player;
import com.vedruna.football.persistance.repository.PlayerRepository;

@Service
public class PlayerServiceImpI implements PlayerServiceI{
	
	@Autowired
	PlayerRepository playerRepository;

	@Override
	public List<PlayerDTO> getAllPlayers() {
		
		List<Player> players = playerRepository.findAll();
		List<PlayerDTO> playersDTO = new ArrayList<>();
		
		for(Player player : players) {
			playersDTO.add(new PlayerDTO(player));
		}
			
		return playersDTO;
	}

	@Override
	public PlayerDTO getPlayerByUsername(String username) {
		PlayerDTO playerDTO = new PlayerDTO(playerRepository.findByUsername(username));
		return playerDTO;
		
	}

	@Override
	public void addPlayer(PlayerDTO playerDTO) {
		Player newPlayer = new Player();
		
		newPlayer.setIdplayer(playerDTO.getIdPlayer());
		newPlayer.setUsername(playerDTO.getUsername());
		newPlayer.setPlayerHasTrophies(null);
		playerRepository.save(newPlayer);
		
	}

}
