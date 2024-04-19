package mx.utng.pd.absfactory;

public class CamionetaLujosa implements Camioneta {
    private String nombre;

    public CamionetaLujosa(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getCaracteristicas() {
        return "Camioneta con muchas características de lujo";
    }
}
