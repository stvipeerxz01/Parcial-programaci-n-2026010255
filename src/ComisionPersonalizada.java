public class ComisionPersonalizada implements EstrategiaComision {
    private final double porcentaje;

    public ComisionPersonalizada(String Adrian) {
        int n = Adrian.length();
        this.porcentaje = (5 + n) / 100.0;
    }

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * porcentaje;
    }
}