package weeks.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Teachers")
public class TeacherEntity {

    @Id
    @GeneratedValue
    private int id;
    private String name;
}

