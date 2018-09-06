package weeks.controllers;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import weeks.services.AbstractWeeksService;

@RequiredArgsConstructor
public abstract class AbstractWeeksController<ENTITY, ID> {

  private final AbstractWeeksService<ENTITY, ID> weeksService;

  @GetMapping
  public List<ENTITY> getAll() {
    return weeksService.getAll();
  }

  @PostMapping("/add")
  public void add(@RequestBody ENTITY entity) {
    weeksService.add(entity);
  }

  @RequestMapping(method = RequestMethod.DELETE, path = "/remove/{id}")
  public void removeById(@PathVariable ID id) {
    weeksService.removeById(id);
  }
}
