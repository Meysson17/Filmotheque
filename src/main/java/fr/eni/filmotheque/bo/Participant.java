package fr.eni.filmotheque.bo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Participant")
public class Participant {
@Id
@GeneratedValue
	private Integer id;
	@Column(length = 50, nullable = false)
	@NotNull
	private String nom;
	@Column(length = 50, nullable = false)
	@NotNull
	private String prenom;


	public Participant(Integer id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Participant() {

	}

	@Override
	public String toString() {
		return "Personne{" +
				"id=" + id +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
