package fr.hopelessworld.sample.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import fr.hopelessworld.sample.entity.Player;

public interface PlayerRepository extends PagingAndSortingRepository<Player, Long>, JpaSpecificationExecutor<Player> {

}
