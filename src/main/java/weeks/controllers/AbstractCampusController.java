package weeks.controllers;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import weeks.services.AbstractCampusService;

@RequiredArgsConstructor
public abstract class AbstractCampusController<ENTITY, ID> {

    private final AbstractCampusService<ENTITY, ID> campusService;

    @GetMapping
    public List<ENTITY> getAll() {
        return campusService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody ENTITY entity) {
        campusService.add(entity);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/remove/{id}")
    public void removeById(@PathVariable ID id) {
        campusService.removeById(id);
    }
}
