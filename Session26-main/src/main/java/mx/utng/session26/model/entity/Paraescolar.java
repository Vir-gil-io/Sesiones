package mx.utng.session26.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Paraescolar {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

     @NotEmpty
    @Column(length = 30)
    private String nombreParaescolar;

    @NotEmpty
    @Column(length = 30)
    private String profesor;

    @Temporal(TemporalType.DATE)
    private Date recordAt;
    
    @PrePersist
    public void prePersist(){
        recordAt = new Date();
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }

    public Date getRecordAt() {
        return recordAt;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setNombreParaescolar(String nombreParaescolar) {
        this.nombreParaescolar = nombreParaescolar;
    }

    public String getNombreParaescolar() {
        return nombreParaescolar;
    }


}

   