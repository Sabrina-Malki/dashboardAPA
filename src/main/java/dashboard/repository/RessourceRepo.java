package dashboard.repository;

import dashboard.model.Ressource;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RessourceRepo extends CrudRepository<Ressource,Long> {

    List<Ressource> findByClassifications_Lot_idAndEtat(Long id,String etat);
}
