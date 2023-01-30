package fr.eni.filmotheque.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.services.FilmsService;

public class FilmContextApplication {
	
	private FilmsService filmService;
	
	private List<Genre> genres;

	
	@Autowired
	public FilmContextApplication(FilmsService filmService) {
		this.filmService = filmService;
		genres = filmService.getGenres();
	}
	
	public List<Genre> getGenres() {
		return genres;
	}


	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}


	
	


}
