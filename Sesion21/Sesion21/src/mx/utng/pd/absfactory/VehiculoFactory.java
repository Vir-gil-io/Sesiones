package mx.utng.pd.absfactory;

public abstract class VehiculoFactory {
    private static final String VEHICULO_LUJO= "Lujo";
    private static final String VEHICULO_ECONOMICO="Economico";

    public abstract Auto getAuto();
    public abstract Camioneta getCamioneta();
    
}
