package dashboard.repository;

import dashboard.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepo extends JpaRepository<Permission,Long> {

    List<Permission> findByRoles_id(Long id);
}
