package com.vedruna.football.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.football.dto.PlayerDTO;
import com.vedruna.football.services.PlayerServiceImpI;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {
	
	@Autowired
	PlayerServiceImpI playerService;
	
	@GetMapping()
	public List<PlayerDTO> getAllPlayers (){
		return playerService.getAllPlayers();
	}
	
	@GetMapping("/{username}")
	public PlayerDTO getPlayerByUsername(@PathVariable String username) {
		return playerService.getPlayerByUsername(username);
	}

}
