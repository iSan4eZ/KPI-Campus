package weeks.services.impl;

import org.springframework.stereotype.Service;
import weeks.entities.GroupEntity;
import weeks.repositories.impl.GroupRepository;
import weeks.services.AbstractWeeksService;

@Service
public class GroupService extends AbstractWeeksService<GroupEntity, Integer> {

  public GroupService(GroupRepository groupRepository) {
    super(groupRepository);
  }
}
