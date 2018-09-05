package weeks.services;

import com.google.common.collect.Lists;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import weeks.repositories.WeeksRepository;

@RequiredArgsConstructor
public abstract class AbstractWeeksService<ENTITY, ID> {

  private final WeeksRepository<ENTITY, ID> weeksRepository;

  public List<ENTITY> getAll() {
    return Lists.newArrayList(weeksRepository.findAll());
  }

  public void add(ENTITY entity) {
    weeksRepository.save(entity);
  }

  @Transactional
  public void removeById(ID id) {
    weeksRepository.deleteById(id);
  }
}
