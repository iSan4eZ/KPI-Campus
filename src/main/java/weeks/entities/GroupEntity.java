package weeks.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Groups")
public class GroupEntity {

  @Id
  @GeneratedValue
  private int id;
  private String name;
}

