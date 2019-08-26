package dashboard.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(schema = "ressource")

@Entity
public class Ressource implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nom_commun;
    private String nom_scientifique;
    private Boolean voie_disparition;
    private int population;
    private String couleur;
    private Double taille;
    private String utilisation;
    private String photo;
    private Boolean visible;
    private int nbr_consultation;
    @Enumerated(EnumType.STRING)
    private EtatValidation etat;

    @ManyToMany(targetEntity=Classification.class)
    @JoinTable(schema="ressource")
    private List<Classification> classifications;

    @ManyToMany(targetEntity=Connaissance.class)
    @JoinTable(schema="ressource")
    private List<Connaissance> connaissances;

    @ManyToMany(targetEntity=Localisation.class)
    @JoinTable(schema="ressource")
    private List<Localisation> localisations;

    @ManyToMany(targetEntity=Commune.class)
    @JoinTable(schema="ressource")
    private List<Commune> communes;

    @OneToMany(mappedBy="caracteristique", cascade = CascadeType.ALL)
    private List<RessourceCaracteristique> ressourceCaracteristiques;

    @OneToMany(mappedBy="utilisateur", cascade = CascadeType.ALL)
    private List<RessourceUtilisateur> ressourceUtilisateur;

    public Long getId() {
        return id;
    }


    public String getNom_commun() {
        return nom_commun;
    }

    public void setNom_commun(String nom_commun) {
        this.nom_commun = nom_commun;
    }

    public String getNom_scientifique() {
        return nom_scientifique;
    }

    public void setNom_scientifique(String nom_scientifique) {
        this.nom_scientifique = nom_scientifique;
    }

    public Boolean getVoie_disparition() {
        return voie_disparition;
    }

    public void setVoie_disparition(Boolean voie_disparition) {
        this.voie_disparition = voie_disparition;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Double getTaille() {
        return taille;
    }

    public void setTaille(Double taille) {
        this.taille = taille;
    }

    public String getUtilisation() {
        return utilisation;
    }

    public void setUtilisation(String utilisation) {
        this.utilisation = utilisation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public int getNbr_consultation() {
        return nbr_consultation;
    }

    public void setNbr_consultation(int nbr_consultation) {
        this.nbr_consultation = nbr_consultation;
    }

    public List<Classification> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<Classification> classifications) {
        this.classifications = classifications;
    }

    public List<Connaissance> getConnaissances() {
        return connaissances;
    }

    public void setConnaissances(List<Connaissance> connaissances) {
        this.connaissances = connaissances;
    }

    public List<Localisation> getLocalisations() {
        return localisations;
    }

    public void setLocalisations(List<Localisation> localisations) {
        this.localisations = localisations;
    }

    public List<Commune> getCommunes() {
        return communes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCommunes(List<Commune> communes) {
        this.communes = communes;
    }

    public List<RessourceCaracteristique> getRessourceCaracteristiques() {
        return ressourceCaracteristiques;
    }

    public void setRessourceCaracteristiques(List<RessourceCaracteristique> ressourceCaracteristiques) {
        this.ressourceCaracteristiques = ressourceCaracteristiques;
    }

    public List<RessourceUtilisateur> getRessourceUtilisateur() {
        return ressourceUtilisateur;
    }

    public void setRessourceUtilisateur(List<RessourceUtilisateur> ressourceUtilisateur) {
        this.ressourceUtilisateur = ressourceUtilisateur;
    }

    public EtatValidation getEtat() {
        return etat;
    }

    public void setEtat(EtatValidation etat) {
        this.etat = etat;
    }

    public Ressource() {

    }
}
