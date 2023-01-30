package fr.eni.filmotheque.repository;

import fr.eni.filmotheque.bo.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisRepo extends JpaRepository<Avis, Integer> {
}
