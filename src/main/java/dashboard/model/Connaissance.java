package dashboard.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(schema = "ressource")
@Entity
public class Connaissance implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String procedure;
    private String brevet;
    private String ingrediants;
    private String region;
    private String niv_securite;

    public Long getId() {
        return id;
    }


    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getBrevet() {
        return brevet;
    }

    public void setBrevet(String brevet) {
        this.brevet = brevet;
    }

    public String getIngrediants() {
        return ingrediants;
    }

    public void setIngrediants(String ingrediants) {
        this.ingrediants = ingrediants;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNiv_securite() {
        return niv_securite;
    }

    public void setNiv_securite(String niv_securite) {
        this.niv_securite = niv_securite;
    }

    public List<Ressource> getRessources() {
        return Ressources;
    }

    public void setRessources(List<Ressource> ressources) {
        Ressources = ressources;
    }

    @ManyToMany(targetEntity=Ressource.class,mappedBy="connaissances")
    private List<Ressource> Ressources;

    public Connaissance() {
    }



}
