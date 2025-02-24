package com.vedruna.football.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.football.dto.TrophieDTO;
import com.vedruna.football.services.TrophieServiceImpI;

@RestController
@RequestMapping("/api/v1/trophies")
public class TrophieController {
	
	@Autowired
	TrophieServiceImpI trophieService;
	

	@GetMapping()
	public List<TrophieDTO> getAllTrophies(){
		return trophieService.getAllTrophies();
	}
	
	@PostMapping("/addTrophy")
	public void addTrophy(@RequestBody TrophieDTO trophy) {
		trophieService.addTrophy(trophy);
	}
	
	
}

