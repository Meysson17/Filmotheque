package fr.eni.filmotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bo.Participant;
import fr.eni.filmotheque.services.FilmsService;

@Component
public class TabIdParticipantToListParticipantConverter implements Converter<String[], List<Participant>>{

	
	private FilmsService filmService;
		
	
	@Autowired
	public void setFilmService( FilmsService filmService) {
		this.filmService = filmService;	
	}

	@Override
	public List<Participant> convert(String[] participantIds) {
		List<Participant> participants = new ArrayList<>();
		for(String participantIdStr: participantIds) {
			participants.add(filmService.getParticipantById(Integer.parseInt(participantIdStr)));
		}
		
		return participants;
	}

}
