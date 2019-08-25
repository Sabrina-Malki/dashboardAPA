package dashboard.dto;

public class RolePermissionDTO {

    private Long permission_id;
    private String nom;

    public RolePermissionDTO(Long permission_id, String nom) {
        this.permission_id = permission_id;
        this.nom = nom;
    }

    public Long getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(Long permission_id) {
        this.permission_id = permission_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
