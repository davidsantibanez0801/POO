package mx.unam.fesa.ico.composición.television;

public class MainEjemplo1 {
    public static void main(String[] args) {
        Pantalla p1 = new Pantalla();
        System.out.println(p1);
        p1.encender();
        System.out.println(p1);
//--------------------------------------------------
        Volumen v1 = new Volumen(10);
        System.out.println(v1);
        v1.subir(40);
        System.out.println(v1);
        v1.bajar(30);
        System.out.println(v1);
//--------------------------------------------------
        Canal channel = new Canal(98);
        System.out.println(channel);
        channel.canalSiguinete();

        System.out.println(channel);
        channel.canalSiguinete();

        System.out.println(channel);
        channel.canalSiguinete();

//--------------------------------------------------
        System.out.println("Probando television");
        Tv tele = new Tv("lg", 5050.5f, 40,
                new Volumen(10),
                new Canal(2),
                new Pantalla(false));
        tele.estado();

        tele.getVol().setNivel(6);

        tele.estado();

        tele.getVol().subir(50);

        tele.estado();

        System.out.println(tele);
        System.out.println("-----------------------------------");

        tele.subirCanal();
        tele.estado();

        tele.getScreen().encender();

        tele.subirCanal();
        tele.estado();


    }
}
