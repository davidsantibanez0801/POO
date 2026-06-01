package mx.unam.fesa.ico.herencia.sistemaEscolar;

public class Prueba {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 32);
        p1.presentarse();
        Profesor profe =  new Profesor("Parrales", 56, "Intro. a la Ing. en Computacion");
        profe.impartirClase();
    }
}
