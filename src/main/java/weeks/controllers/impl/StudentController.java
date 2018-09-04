package weeks.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weeks.controllers.AbstractWeeksController;
import weeks.entities.StudentEntity;
import weeks.services.impl.StudentService;

@RestController
@RequestMapping("students")
public class StudentController extends AbstractWeeksController<StudentEntity, Integer> {

  public StudentController(StudentService studentService) {
    super(studentService);
  }
}
