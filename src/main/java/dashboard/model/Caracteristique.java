package dashboard.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Table(schema = "ressource")
@Entity
public class Caracteristique implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nom;
    private String detail;

    @OneToMany(mappedBy="ressource", cascade = CascadeType.ALL)
    private List<RessourceCaracteristique> ressourcecaracteristique;

    public Caracteristique() {
    }


    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<RessourceCaracteristique> getRessourcecaracteristique() {
        return ressourcecaracteristique;
    }

    public void setRessourcecaracteristique(List<RessourceCaracteristique> ressourcecaracteristique) {
        this.ressourcecaracteristique = ressourcecaracteristique;
    }
}
