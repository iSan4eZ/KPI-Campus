package weeks.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weeks.controllers.AbstractWeeksController;
import weeks.entities.GroupEntity;
import weeks.services.impl.GroupService;

@RestController
@RequestMapping("groups")
public class GroupController extends AbstractWeeksController<GroupEntity, Integer> {

    public GroupController(GroupService groupService){
        super (groupService);
    }
}
//у тебя динамический IP? не знаю навреное щамммммммм
//был 193.161.15.68 стал 193.161.15.67
//надо будет в докере базу поднимать