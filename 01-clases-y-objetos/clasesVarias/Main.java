package mx.unam.fesa.ico.clasesVarias;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Libro l1 = new Libro();
        Libro l2 = new Libro("Somos detectives", "gona89", 2014, 59);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        l2.setAnhoDePublicacion(1987);
        l2.setCantidadDeEjemplares(23);
        System.out.println(l2.toString());


        Coche c1 = new Coche();
        Coche c2 = new Coche("toyota", "001", "negro");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c2.encenderAuto();

        Arbol a1 = new Arbol();
        Arbol a2 = new Arbol(16.7f, 55,"cafe");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        Aspiradora as1 = new Aspiradora();
        Aspiradora as2 = new Aspiradora("oster", 150, "rectangular", 10, 1500);
        System.out.println(as1.toString());
        System.out.println(as2.toString());

        ArbolDos ar1 = new ArbolDos();
        ArbolDos ar2 = new ArbolDos("roble", "fisuradas", 55, 15, 1000, 5);
        System.out.println(ar1.toString());
        System.out.println(ar2.toString());

        Carro car1 = new Carro();
        Carro car2 = new Carro("negro", "agera R", 3000000, 34000);
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        Mochila m1 = new Mochila();
        Mochila m2 = new Mochila("rojo", true, 350, "mediana", 5);
        System.out.println(m1.toString());
        System.out.println(m2.toString());

        Bicicleta b1 = new Bicicleta();
        Bicicleta b2 = new Bicicleta("azul", 55, 35, 25, "aluminio");
        System.out.println(b1.toString());
        System.out.println(b2.toString());

    }
}