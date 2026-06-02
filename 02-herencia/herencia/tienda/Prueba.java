package mx.unam.fesa.ico.herencia.tienda;

public class Prueba {
    public static void main(String[] args) {
        Producto p1 = new Producto("Sabritas", 18.50f);
        ProductoElectronico pe1 = new ProductoElectronico("Tableta", 3500.50f,12);
        p1.mostrarPrecio();
        pe1.mostrarGarantia();
    }
}
