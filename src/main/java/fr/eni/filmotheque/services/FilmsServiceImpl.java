package fr.eni.filmotheque.services;

import java.util.List;

import fr.eni.filmotheque.repository.FilmRepo;
import fr.eni.filmotheque.repository.GenreRepo;
import fr.eni.filmotheque.repository.ParticipantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.bo.Participant;

@Service
public class FilmsServiceImpl implements FilmsService {
    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private GenreRepo genreRepo;

    @Autowired
    private ParticipantRepo participantRepo;

    private List<Film> films;
    private List<Genre> genres;
    private List<Participant> participants;

    int compteurFilm = 2;

    @Override
    public List<Film> getAllFilms() {


        return filmRepo.findAll();
    }

    @Override
    public Film getFilmById(int id) {

        return filmRepo.findById(id).get();
    }

    @Override
    public List<Genre> getGenres() {

        return genreRepo.findAll();
    }

    @Override
    public List<Participant> getParticipants() {

        return participantRepo.findAll();
    }

    @Override
    public Genre getGenreById(int genreId) {
       return genreRepo.findById(genreId).get();
    }

    @Override
    public Participant getParticipantById(int realisateurId) {
       return participantRepo.findById(realisateurId).get();
    }

    @Override
    public void ajouterFilm(Film film) {
        filmRepo.save(film);

    }

}
