package com.vedruna.football.persistance.models;

import java.util.List;

import com.vedruna.football.dto.TrophieDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="trophies")
public class Trophie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idtrophie")
	private int idtrophie;
	
	@Column(name="title")
	private String title;

	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "trophie")
    private List<PlayerHasTrophy> playerHasTrophies;
	
	
	public Trophie(TrophieDTO trophieDTO) {
		this.idtrophie= trophieDTO.getIdTrophy();
	    this.title = trophieDTO.getTitle();
	    this.description = trophieDTO.getDescription();
	    
	}


	

}
