package swimtracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Practice{
private String/*No type specified!*/ practiceDate;
   
   public void setPracticeDate(String/*No type specified!*/ value) {
this.practiceDate = value;
    }
public String/*No type specified!*/ getPracticeDate() {
return this.practiceDate;
    }
private Integer id;

public void setId(Integer value) {
this.id = value;
    }
@Id
public Integer getId() {
return this.id;
       }
   }
