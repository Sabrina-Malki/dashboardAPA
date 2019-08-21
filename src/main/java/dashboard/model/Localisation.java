package dashboard.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Table(schema = "ressource")

@Entity
public class Localisation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String coord_geo;
    private String url_google_maps;

    @ManyToMany(targetEntity=Ressource.class,mappedBy="localisations")
    private List<Ressource> Ressources;

    public Long getId() {
        return id;
    }


    public String getCoord_geo() {
        return coord_geo;
    }

    public void setCoord_geo(String coord_geo) {
        this.coord_geo = coord_geo;
    }

    public String getUrl_google_maps() {
        return url_google_maps;
    }

    public void setUrl_google_maps(String url_google_maps) {
        this.url_google_maps = url_google_maps;
    }

    public List<Ressource> getRessources() {
        return Ressources;
    }

    public void setRessources(List<Ressource> ressources) {
        Ressources = ressources;
    }

    public Localisation() {

    }
}
