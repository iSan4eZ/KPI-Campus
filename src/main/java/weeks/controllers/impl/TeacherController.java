package weeks.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weeks.controllers.AbstractWeeksController;
import weeks.entities.TeacherEntity;
import weeks.services.impl.TeacherService;

@RestController
@RequestMapping("teachers")
public class TeacherController extends AbstractWeeksController<TeacherEntity, Integer> {

    public TeacherController(TeacherService teacherService){
        super (teacherService);
    }
}
