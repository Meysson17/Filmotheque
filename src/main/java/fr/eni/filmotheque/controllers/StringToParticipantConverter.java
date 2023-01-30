package fr.eni.filmotheque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bo.Participant;
import fr.eni.filmotheque.services.FilmsService;

@Component
public class StringToParticipantConverter implements Converter<String, Participant> {

	private FilmsService filmService;
	
	@Autowired
	public void setFilmService( FilmsService filmService) {
		this.filmService = filmService;
	}

	
	@Override
	public Participant convert(String source) {
		Integer idParticipant = Integer.parseInt(source);
		return filmService.getParticipantById(idParticipant);
	}

}
