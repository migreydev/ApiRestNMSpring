package com.vedruna.football.persistance.models;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="players")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idplayer")
	private int idplayer;
	
	@Column(name="username")
	private String username;
	
	@ManyToMany
	@JoinTable(name="players_has_trophies", joinColumns= {@JoinColumn(name="players_idplayer")}, inverseJoinColumns={@JoinColumn(name="trophies_idtrophie")})
    private List<Trophie> TrophiesHasPlayer = new ArrayList<>();

}
