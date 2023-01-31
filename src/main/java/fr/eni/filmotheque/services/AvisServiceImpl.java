package fr.eni.filmotheque.services;

import fr.eni.filmotheque.bo.Avis;
import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.repository.AvisRepo;
import fr.eni.filmotheque.repository.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AvisServiceImpl implements AvisService {
    @Autowired
    private AvisRepo avisRepo;
    @Autowired
    private FilmRepo filmRepo;
    @Override
    public List<Avis> getAllAvis() {
        return avisRepo.findAll();
    }

    @Override
    public List<Film> getAllFilms() {
        return filmRepo.findAll();
    }

    @Override
    public void ajouterAvis(Avis avis) {
        avisRepo.save(avis);
    }
}
