package dashboard.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(schema = "public")

@Entity
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private Boolean password;
    private String user_name;
    private String profession;
    private String image;

    @OneToMany(mappedBy="ressource", cascade = CascadeType.ALL)
    private List<RessourceUtilisateur> ressourceutilisateur;

    @ManyToMany(targetEntity=Role.class)
    private List<Role> roles;

    public Utilisateur() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Boolean getPassword() {
        return password;
    }

    public void setPassword(Boolean password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<RessourceUtilisateur> getRessourceutilisateur() {
        return ressourceutilisateur;
    }

    public void setRessourceutilisateur(List<RessourceUtilisateur> ressourceutilisateur) {
        this.ressourceutilisateur = ressourceutilisateur;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
