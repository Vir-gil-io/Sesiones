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
public class Library {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

     @NotEmpty
    @Column(length = 30)
    private String autor;

    @NotEmpty
    @Column(length = 30)
    private String libro;

    @NotEmpty
    @Column(length = 30)
    private String alumno;

    @Temporal(TemporalType.DATE)
    private Date recordAt;

      @PrePersist
    public void prePersist(){
        recordAt = new Date();
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
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

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getLibro() {
        return libro;
    }



    
    
}
