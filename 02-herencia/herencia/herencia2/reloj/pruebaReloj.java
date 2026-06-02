package mx.unam.fesa.ico.herencia.reloj;

public class pruebaReloj {
    public static void main(String[] args) {
        Reloj wacho = new Reloj();
        while(true){
            try {
                Thread.sleep(1000);
                wacho.incrementarSegundo();
                System.out.println(wacho);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
