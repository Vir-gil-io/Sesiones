package mx.utng.s23.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Pokemon {
    @Id
    @GenerateValue(strategy= GenerationType.AUTO)
    private long id;
    
    @Column(length=50, nullable=false)
    private String name;
    
    @Column(length=50, nullable=false)
    private Type type;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    

}
