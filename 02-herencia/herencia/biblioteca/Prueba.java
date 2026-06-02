package mx.unam.fesa.ico.herencia.biblioteca;

public class Prueba {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan Perez", 37);
        p1.mostrarDatos();
        Bibliotecario b1 = new Bibliotecario("Erick Escamosa",20, "8762134");
        b1.mostrarDatos();
        b1.registrarPrestamo();
    }
}
