package fr.hopelessworld.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Player {

	@Id
	private Long id;

	@Column(nullable = false)
	private String name;

	@ManyToOne
	@JoinColumn(name = "idteam", nullable = true)
	private Team team;

}
