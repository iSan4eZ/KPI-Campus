package weeks.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CampusRepository<ENTITY, ID> extends CrudRepository<ENTITY, ID> {

}
