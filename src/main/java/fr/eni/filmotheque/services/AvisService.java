package fr.eni.filmotheque.services;

import fr.eni.filmotheque.bo.Avis;
import fr.eni.filmotheque.bo.Film;

import java.util.List;

public interface AvisService {
    List<Avis> getAllAvis();
    List<Film> getAllFilms();

    void ajouterAvis(Avis avis);
}
