package swimtracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

@Entity
public class Group{
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
private Set<Swimmer> swimmer;

@ManyToMany(mappedBy="group")
public Set<Swimmer> getSwimmer() {
   return this.swimmer;
}

public void setSwimmer(Set<Swimmer> swimmers) {
   this.swimmer = swimmers;
}

private Set<TrainningGroup> trainningGroup;

@OneToMany(mappedBy="group", cascade={CascadeType.ALL})
public Set<TrainningGroup> getTrainningGroup() {
   return this.trainningGroup;
}

public void setTrainningGroup(Set<TrainningGroup> trainningGroups) {
   this.trainningGroup = trainningGroups;
}

private Organization organization;

@ManyToOne(optional=false)
public Organization getOrganization() {
   return this.organization;
}

public void setOrganization(Organization organization) {
   this.organization = organization;
}

}
