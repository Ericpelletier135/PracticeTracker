package swimtracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.ManyToMany;

@Entity
public class Swimmer{
private String firstName;
   
   public void setFirstName(String value) {
this.firstName = value;
    }
public String getFirstName() {
return this.firstName;
    }
private String lastName;

public void setLastName(String value) {
this.lastName = value;
    }
public String getLastName() {
return this.lastName;
    }
private Integer id;

public void setId(Integer value) {
this.id = value;
    }
@Id
public Integer getId() {
return this.id;
    }
private Set<Group> group;

@ManyToMany
public Set<Group> getGroup() {
   return this.group;
}

public void setGroup(Set<Group> groups) {
   this.group = groups;
}

private Set<TrainningGroup> trainningGroup;

@ManyToMany
public Set<TrainningGroup> getTrainningGroup() {
   return this.trainningGroup;
}

public void setTrainningGroup(Set<TrainningGroup> trainningGroups) {
   this.trainningGroup = trainningGroups;
}

}
