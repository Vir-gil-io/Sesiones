package mx.utng.s22.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Trainer {
    @Id
    @GenerateValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(nullable =false, length =50)
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

}
