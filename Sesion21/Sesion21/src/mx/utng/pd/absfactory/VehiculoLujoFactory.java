package mx.utng.pd.absfactory;

public class VehiculoLujoFactory extends VehiculoFactory {
    @Override
    public Auto getAuto() {
        return new AutoLujoso("A-L");
    }
    @Override
    public Camioneta getCamioneta() {
        
        return new CamionetaLujosa("C-L");
    }
}
