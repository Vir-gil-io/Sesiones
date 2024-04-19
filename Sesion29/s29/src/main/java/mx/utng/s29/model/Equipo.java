package mx.utng.s29.model;

@Entity
public class Equipo {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Size(max= 45)
    private String nombre;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    


}
