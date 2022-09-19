package swimtracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
public class Organization{
private Integer id;
   
   public void setId(Integer value) {
this.id = value;
    }
@Id
public Integer getId() {
return this.id;
    }
private String name;

public void setName(String value) {
this.name = value;
    }
public String getName() {
return this.name;
    }
private Set<Group> group;

@OneToMany(mappedBy="organization", cascade={CascadeType.ALL})
public Set<Group> getGroup() {
   return this.group;
}

public void setGroup(Set<Group> groups) {
   this.group = groups;
}

}
