package mx.unam.fesa.ico.composicion.candado;

public class Prueba {
    public static void main(String[] args) {
        Candado can = new Candado();

        System.out.println(can);

        can.setCombinacio("314");

        System.out.println(can);

        can.girarEngrane(0,3);
        can.girarEngrane(1,4);
        can.girarEngrane(2,1);

        can.abrir();

        can.girarEngrane(1,7);
        can.girarEngrane(2,3);

        can.abrir();
    }
}
