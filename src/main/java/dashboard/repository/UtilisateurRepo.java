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


//      @Query(
//              value="SELECT id FROM Role r " +
//              "JOIN r.utilisateurs u", nativeQuery = true
//            )
//      List<Long> findRolesUtilisateur(
//              @Param("util_id") Long util_id
//      );

//
//      @Query("SELECT permissions_id FROM role_permissions WHERE roles_id = :role_id")
//      List<Long> findPermissionsRoles(
//              @Param("role_id") Long role_id
//      );

}
