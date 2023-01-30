package fr.eni.filmotheque.repository;

import fr.eni.filmotheque.bo.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<Film, Integer> {
}
