package weeks.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weeks.controllers.AbstractWeeksController;
import weeks.entities.GroupEntity;
import weeks.services.impl.GroupService;

@RestController
@RequestMapping("teachers")
public class GroupController extends AbstractWeeksController<GroupEntity, Integer> {

    public GroupController(GroupService groupService){
        super (groupService);
    }
}
