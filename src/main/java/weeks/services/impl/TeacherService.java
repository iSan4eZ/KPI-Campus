package weeks.services.impl;

import org.springframework.stereotype.Service;
import weeks.entities.TeacherEntity;
import weeks.repositories.impl.TeacherRepository;
import weeks.services.AbstractWeeksService;

@Service
public class TeacherService extends AbstractWeeksService<TeacherEntity, Integer> {

  public TeacherService(TeacherRepository teacherRepository) {
    super(teacherRepository);
  }
}
