package mx.utng.gfcg.model.entity;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Evaluacion {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date recordAt;

    @PrePersist
    public void prePersist(){
        recordAt = new Date();
    }

    @NotEmpty
    @Column(length = 90)
    private String evaluador;

    @Min(value = 0)
    @Max(value = 10)
    private double calificacion;

    @NotEmpty
    @Column(length = 90)
    private String observaciones;
   

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Date getRecordAt() {
        return recordAt;
    }
    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }

    public String getEvaluador() {
        return evaluador;
    }
    public void setEvaluador(String evaluador) {
        this.evaluador = evaluador;
    }

    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
