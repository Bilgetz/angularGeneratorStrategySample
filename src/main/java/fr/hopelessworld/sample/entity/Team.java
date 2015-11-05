package fr.hopelessworld.sample.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Team {

	@Id
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "team")
	private List<Player> players;
}
