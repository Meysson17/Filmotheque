package fr.eni.filmotheque.bo;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

public class Avis {
	
	private Integer id;
	
	private int note;
	
	private String commentaire;

	public Avis() {
		// TODO Auto-generated constructor stub
	}
	
	public Avis(Integer id, int note, String commentaire) {
		super();
		this.id = id;
		this.note = note;
		this.commentaire = commentaire;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public String toString() {
		return "Avis [id=" + id + ", note=" + note + ", commentaire=" + commentaire + "]";
	}

}
