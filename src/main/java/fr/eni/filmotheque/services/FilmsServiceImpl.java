package fr.eni.filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.bo.Participant;

@Service
public class FilmsServiceImpl implements FilmsService{

	
	Participant archainbaud = new Participant(0, "Wilder", "Billy");
	Participant spielberg = new Participant(1, "Spielberg", "Steven");
	Participant patWelsh = new Participant(2, "Welsh", "Pat");
	Participant henryThomas = new Participant(3, "Thomas", "Henry");
	Participant marylin = new Participant(4, "Monroe", "Marylin");
	Participant tony = new Participant(5, "Curtis", "Tony");
	Participant jack = new Participant(6, "Lemmon", "Jack");
	Participant iti = new Participant(7, "Ti", "i");
	Participant shirley = new Participant(8, "Shirley", "MacLane");
	
	
	private List<Film> films ;
	private List<Genre> genres;	
	private List<Participant> participants;
	
	
	Genre comedie = new Genre(0, "comedie");
	Genre scienceFiction = new Genre(1, "science fiction");

	int compteurFilm = 2;
	
	@Override
	public List<Film> getAllFilms() {
		if(films==null) {
			
			
			
			Film someLikeItHot = new Film(0, "Some like it hot", 1939, archainbaud, 180, comedie, "bla bla bla");
			someLikeItHot.addActeur(marylin);
			someLikeItHot.addActeur(tony);
			someLikeItHot.addActeur(jack);
			
			Film et = new Film(1, "ET", 1982, spielberg, 180, scienceFiction,"bla bla bla");
			et.addActeur(patWelsh);
			et.addActeur(iti);
			
			films = new ArrayList<Film>();
			films.add(someLikeItHot);
			films.add(et);
			
		}
		
		return films;
	}

	@Override
	public Film getFilmById(int id) {
		
		for(Film f: films) {
			if(f.getId()==id) {
				return f;
			}
		}
		
		return null;
	}

	@Override
	public List<Genre> getGenres() {
		if(genres==null) {
			genres = new ArrayList<Genre>();
			genres.add(comedie);
			genres.add(scienceFiction);

		}
		return genres;
	}

	@Override
	public List<Participant> getParticipants() {
		if(participants==null) {
			participants = new ArrayList<Participant>();
			participants.add(archainbaud);
			participants.add(spielberg);
			participants.add(patWelsh);
			participants.add(henryThomas);
			participants.add(marylin);
			participants.add(tony);
			participants.add(jack);
			participants.add(shirley);
		}
		return participants;
	}

	@Override
	public Genre getGenreById(int genreId) {
		for(Genre g: genres) {
			if(genreId==g.getId()) {
				return g;
			}
		}
		return null;
	}

	@Override
	public Participant getParticipantById(int realisateurId) {
		for(Participant p: participants) {
			if(realisateurId==p.getId()) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void ajouterFilm(Film film) {
		film.setId(compteurFilm++);
		films.add(film);
		
	}

}
