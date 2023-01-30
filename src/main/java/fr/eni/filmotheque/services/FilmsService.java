package fr.eni.filmotheque.services;

import java.util.List;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.bo.Participant;

public interface FilmsService {

	List<Film> getAllFilms();

	Film getFilmById(int id);

	List<Genre> getGenres();

	List<Participant> getParticipants();

	Genre getGenreById(int genreId);

	Participant getParticipantById(int idParticipant);
	
	void ajouterFilm(Film film);
	
	
	
}
