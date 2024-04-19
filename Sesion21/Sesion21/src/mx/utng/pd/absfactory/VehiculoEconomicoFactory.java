package mx.utng.pd.absfactory;

public class VehiculoEconomicoFactory extends VehiculoFactory {
    @Override
    public Auto getAuto() {
        return new AutoEconomico("A-E");
    }
    @Override
    public Camioneta getCamioneta() {
        
        return new CamionetaEconomica("C-E");
    }
}
