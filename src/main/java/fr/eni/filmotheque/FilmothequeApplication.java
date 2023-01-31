package fr.eni.filmotheque;

import fr.eni.filmotheque.controllers.AvisContextApplication;
import fr.eni.filmotheque.services.AvisService;
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
	@Bean
	public AvisContextApplication avisContextApplication(AvisService avisService) {
		return new AvisContextApplication( avisService);
	}
}
