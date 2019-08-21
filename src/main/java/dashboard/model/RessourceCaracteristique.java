package dashboard.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import javax.persistence.Table;

@Table(schema = "ressource")
@Entity
public class RessourceCaracteristique implements Serializable {

    private String valeur;
    //private int niv_sec;
    @Id
    @ManyToOne
    @JoinColumn(name = "caracteristique_id")
    private Caracteristique caracteristique;

    @Id
    @ManyToOne
    @JoinColumn(name = "ressource_id")
    private Ressource ressource;

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Caracteristique getCaracteristique() {
        return caracteristique;
    }

    public void setCaracteristique(Caracteristique caracteristique) {
        this.caracteristique = caracteristique;
    }

    public Ressource getRessource() {
        return ressource;
    }

    public void setRessource(Ressource ressource) {
        this.ressource = ressource;
    }

    public  RessourceCaracteristique() {
    }

}
