package fr.eni.filmotheque.bo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Genre")
public class Genre {
@Id
@GeneratedValue

    private Integer id;
    @NotNull
    private String libelle;


    public Genre(Integer id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Genre() {

    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


}
