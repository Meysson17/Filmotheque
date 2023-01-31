package fr.eni.filmotheque.controllers;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.services.AvisService;
import fr.eni.filmotheque.services.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AvisContextApplication {

    private AvisService avisService;
    private List<Film> films;
    @Autowired
    public AvisContextApplication(AvisService avisService) {
        this.avisService = avisService;
        films = avisService.getAllFilms();

    }

    public List<Film> getFilms() {
        return films;
    }


    public void setFilms(List<Film> film) {
        this.films = film;
    }


}
