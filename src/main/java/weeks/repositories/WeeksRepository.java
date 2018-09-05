package weeks.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface WeeksRepository<ENTITY, ID> extends CrudRepository<ENTITY, ID> {

}
