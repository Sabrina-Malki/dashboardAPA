package dashboard.repository;


import dashboard.dto.RolePermissionDTO;
import dashboard.dto.RoleUtilisateurDTO;
import dashboard.model.Role;
import dashboard.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UtilisateurRepo extends JpaRepository<Utilisateur,Long> {



}
