package mx.unam.fesa.ico.herencia.animales;

public class Prueba {
    public static void main(String[] args) {
        Animal a1 = new Animal("Galleta", 2);
        Perro p1 = new Perro("Astro", 1 , "Labrador");

        a1.comer();
        p1.ladrar();
    }



}
