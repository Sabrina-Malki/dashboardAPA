package dashboard.dto;

public class RoleUtilisateurDTO {

    private Long role_id;

    public RoleUtilisateurDTO(Long role_id) {
        this.role_id = role_id;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

}
