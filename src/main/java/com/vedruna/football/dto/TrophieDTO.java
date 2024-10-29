package com.vedruna.football.dto;


import com.vedruna.football.persistance.models.Trophie;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TrophieDTO {
	
	private int idTrophy;
    private String title;
    private String description;
    
    public TrophieDTO(Trophie trophie) {
    	this.idTrophy = trophie.getIdtrophie();
    	this.title = trophie.getTitle();
    	this.description = trophie.getDescription();
    	
    	
    }

}
