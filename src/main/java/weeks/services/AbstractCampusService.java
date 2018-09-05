package weeks.services;

import com.google.common.collect.Lists;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import weeks.repositories.CampusRepository;

@RequiredArgsConstructor
public abstract class AbstractCampusService<ENTITY, ID> {

  private final CampusRepository<ENTITY, ID> campusRepository;

  public List<ENTITY> getAll() {
    return Lists.newArrayList(campusRepository.findAll());
  }

  public void add(ENTITY entity) {
    campusRepository.save(entity);
  }

  @Transactional
  public void removeById(ID id) {
    campusRepository.deleteById(id);
  }
}
