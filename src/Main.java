public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Shaiel Canales", 10000);
        vendedor.cambiarEstrategia(new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
