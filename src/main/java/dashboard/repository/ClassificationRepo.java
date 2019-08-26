package dashboard.repository;

import dashboard.model.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationRepo extends JpaRepository<Classification,Long> {


}
