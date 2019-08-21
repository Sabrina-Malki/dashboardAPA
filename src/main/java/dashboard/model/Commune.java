package dashboard.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(schema = "ressource")
@Entity
public class Commune implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String designation;

    @ManyToMany(targetEntity=Ressource.class,mappedBy="communes")
    private List<Ressource> Ressources;

    public Commune() {
    }


    public Long getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Ressource> getRessources() {
        return Ressources;
    }

    public void setRessources(List<Ressource> ressources) {
        Ressources = ressources;
    }
}
