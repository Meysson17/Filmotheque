package fr.eni.filmotheque.repository;

import fr.eni.filmotheque.bo.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepo extends JpaRepository <Participant, Integer> {
}
