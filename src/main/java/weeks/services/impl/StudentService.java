package weeks.services.impl;

import org.springframework.stereotype.Service;
import weeks.entities.StudentEntity;
import weeks.repositories.impl.StudentRepository;
import weeks.services.AbstractCampusService;

@Service
public class StudentService extends AbstractCampusService<StudentEntity, Integer> {

  public StudentService(StudentRepository studentRepository) {
    super(studentRepository);
  }

}
