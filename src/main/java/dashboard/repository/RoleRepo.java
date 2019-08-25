package dashboard.repository;

import dashboard.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepo extends JpaRepository<Role,Long> {

    List<Role> findByUtilisateurs_id(Long id);
    //List<Role> findById(Long id);

}
