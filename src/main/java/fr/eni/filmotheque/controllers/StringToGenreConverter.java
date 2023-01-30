package fr.eni.filmotheque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.services.FilmsService;

@Component
public class StringToGenreConverter implements Converter<String, Genre> {

	private FilmsService filmService;
	
	@Autowired
	public void setFilmService( FilmsService filmService) {
		this.filmService = filmService;
	}
	
	@Override
	public Genre convert(String genreId) {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(genreId);
		return filmService.getGenreById(id);
	}

}
