package mx.unam.fesa.ico.semaforo;

public class Prueba {
    public static void main(String[] args) {

        Semaforo sem1 = new Semaforo();

        sem1.getLuces(0).setColorDeLuz("verde");
        sem1.getLuces(1).setColorDeLuz("amarillo");
        sem1.getLuces(2).setColorDeLuz("rojo");


        sem1.setTiempoAvanzar(20);
        sem1.setTiempoPreventivo(10);
        sem1.setTiempoAlto(15);

while (true) {
    System.out.println("Inicio de semaforo");
    sem1.avanzar();
    System.out.println("");
    sem1.preventivo();
    System.out.println("");
    sem1.stop();
    System.out.println("fin del semaforo");
    System.out.println("");
      }
    }
}




