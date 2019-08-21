package dashboard.model;


import javax.persistence.*;
import java.io.Serializable;

@Table(schema = "ressource")

@Entity
public class RessourceUtilisateur implements Serializable {

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Ressource getRessource() {
        return ressource;
    }

    public void setRessource(Ressource ressource) {
        this.ressource = ressource;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @Id
    @ManyToOne
    @JoinColumn(name = "ressource_id")
    private Ressource ressource;
}
