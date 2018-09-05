package weeks.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Table(name = "Students")
public class StudentEntity {

  @Id
  @GeneratedValue
  private int id;
  private String name;
}
