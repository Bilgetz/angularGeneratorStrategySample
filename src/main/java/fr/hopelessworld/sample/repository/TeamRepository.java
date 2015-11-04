package fr.hopelessworld.sample.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import fr.hopelessworld.sample.entity.Team;

public interface TeamRepository extends PagingAndSortingRepository<Team, Long>, JpaSpecificationExecutor<Team> {

}
