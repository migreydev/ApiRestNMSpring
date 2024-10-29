package com.vedruna.football.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.PlayerDTO;
import com.vedruna.football.dto.TrophieDTO;
import com.vedruna.football.persistance.models.Player;
import com.vedruna.football.persistance.models.Trophie;
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
		newPlayer.setTrophiesHasPlayer(null);
		playerRepository.save(newPlayer);
		
	}

	@Override
	public void deletePlayer(PlayerDTO playerDTO) {
		Player player = playerRepository.findByUsername(playerDTO.getUsername());
		playerRepository.delete(player);
		
	}

	@Override
	public PlayerDTO getPlayerByIdplayer(int id) {
		PlayerDTO player = new PlayerDTO (playerRepository.findByidplayer(id));
		return player;
	}

	@Override
	public Player getPlayerByUser(String username) {
		Player player = playerRepository.findByUsername(username);
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		Player player = playerRepository.findByidplayer(id);
		return player;
	}

	@Override
	public void updatePlayer(PlayerDTO playerDTO) {
		Player newPlayer = new Player();
		List<Trophie> trophies = new ArrayList<>();
		
		newPlayer.setIdplayer(playerDTO.getIdPlayer());
		newPlayer.setUsername(playerDTO.getUsername());
		
		for(TrophieDTO trophyDTO : playerDTO.getTrophiesPlayer()) {
			Trophie trophy = new Trophie();
	        trophy.setIdtrophie(trophyDTO.getIdTrophy());
	        trophy.setTitle(trophyDTO.getTitle());
	        trophy.setDescription(trophyDTO.getDescription());
	        trophies.add(trophy);
			
		}
		newPlayer.setTrophiesHasPlayer(trophies);
		
		playerRepository.save(newPlayer);
					
	}
	
	

}
