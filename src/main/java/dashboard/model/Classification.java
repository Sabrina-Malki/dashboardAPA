package dashboard.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Table(schema = "ressource")

@Entity
public class Classification implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nom;
    private String description;

    @ManyToMany(targetEntity=Ressource.class,mappedBy="classifications")
    private List<Ressource> Ressources;

    @ManyToOne(targetEntity=Ressource.class)
    private  Lot lot;

    public Classification() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ressource> getRessources() {
        return Ressources;
    }

    public void setRessources(List<Ressource> ressources) {
        Ressources = ressources;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }
}
