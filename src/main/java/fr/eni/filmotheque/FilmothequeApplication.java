package fr.eni.filmotheque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.filmotheque.controllers.FilmContextApplication;
import fr.eni.filmotheque.services.FilmsService;

@SpringBootApplication
public class FilmothequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmothequeApplication.class, args);
	}

	
	@Bean
	public FilmContextApplication filmContextApplication(FilmsService filmService) {
		return new FilmContextApplication( filmService);
	}
}
