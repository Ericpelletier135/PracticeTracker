package swimtracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class TrainningGroup{
private String name;
   
   public void setName(String value) {
this.name = value;
    }
public String getName() {
return this.name;
    }
private Integer id;

public void setId(Integer value) {
this.id = value;
    }
@Id
public Integer getId() {
return this.id;
    }
private Set<Practice> practice;

@ManyToMany
public Set<Practice> getPractice() {
   return this.practice;
}

public void setPractice(Set<Practice> practices) {
   this.practice = practices;
}

private Set<Swimmer> swimmer;

@ManyToMany(mappedBy="trainningGroup")
public Set<Swimmer> getSwimmer() {
   return this.swimmer;
}

public void setSwimmer(Set<Swimmer> swimmers) {
   this.swimmer = swimmers;
}

private Group group;

@ManyToOne(optional=false)
public Group getGroup() {
   return this.group;
}

public void setGroup(Group group) {
   this.group = group;
}

}
