package fr.hopelessworld.sample;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import fr.hopelessworld.sample.entity.Player;
import fr.hopelessworld.sample.entity.Team;

@Configuration
public class ReposytoryRestConfig extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		super.configureRepositoryRestConfiguration(config);
		config.exposeIdsFor(Player.class, Team.class);
	}

}
