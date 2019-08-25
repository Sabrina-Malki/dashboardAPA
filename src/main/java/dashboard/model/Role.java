package dashboard.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Table(schema = "public")

@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nom;
    private String Description;
    private long niv_sec;


    @ManyToMany(targetEntity=Utilisateur.class,mappedBy="roles")
    private List<Utilisateur> utilisateurs;

    @ManyToMany(targetEntity=Permission.class)
    private List<Permission> permissions;

    @ManyToOne(targetEntity=Lot.class)
    private Lot lot;

    public Role(String nom) {
        this.nom = nom;
    }

    public void setId(Long id) {
        this.id = id;
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
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


    public long getNiv_sec() {
        return niv_sec;
    }

    public void setNiv_sec(long niv_sec) {
        this.niv_sec = niv_sec;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public Role() {
    }

}
