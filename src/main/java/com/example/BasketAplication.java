package com.example;

import com.example.service.PlayerService;
import com.example.service.TeamService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
public class BasketAplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(BasketAplication.class, args);

		context.getBean(PlayerService.class).testPlayers();

		context.getBean(TeamService.class).testTeams();


	}
}