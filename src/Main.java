public class Main {
    public static void main(String[] args) {
        Empleado v = new Vendedor("Adrian Enrique Pinto Elizondo", 1500.0);
        v.cambiarEstrategia(new ComisionPersonalizada("Adrian"));
        v.mostrarDetalle();
    }
}