package mx.unam.fesa.ico.semaforo;

import java.util.Arrays;

public class Semaforo {
    private static final int NUMERO_DE_LUCES = 3;
    private int tiempoAvanzar;
    private int tiempoPreventivo;
    private int tiempoAlto;
    private Luz luces[];

    public Semaforo() {
        luces = new Luz[NUMERO_DE_LUCES];

        luces[0] = new Luz();
        luces[1] = new Luz();
        luces[2] = new Luz();

    }

    public Semaforo(int tiempoAvanzar, int tiempoPreventivo, int tiempoAlto, Luz[] luces) {
        this.tiempoAvanzar = tiempoAvanzar;
        this.tiempoPreventivo = tiempoPreventivo;
        this.tiempoAlto = tiempoAlto;
        this.luces = luces;
    }

    public Luz getLuces(int numLuz) {
        if(numLuz >= 0 && numLuz <= 2 ){
            return luces[numLuz];
        }else {
            System.out.println("Ese numero de semaforo no existe");
        }
        return null;
    }

    public void setLuces(Luz luces, int numLuz) {
        if(numLuz >= 0 && numLuz <= 2 ) {
            this.luces[numLuz] = luces;
        }else {
            System.out.println("Ese numero de semaforo no existe");
        }
    }

    public int getTiempoAvanzar() {
        return tiempoAvanzar;
    }

    public void setTiempoAvanzar(int tiempoAvanzar) {
        this.tiempoAvanzar = tiempoAvanzar;
    }

    public int getTiempoPreventivo() {
        return tiempoPreventivo;
    }

    public void setTiempoPreventivo(int tiempoPreventivo) {
        this.tiempoPreventivo = tiempoPreventivo;
    }

    public int getTiempoAlto() {
        return tiempoAlto;
    }

    public void setTiempoAlto(int tiempoAlto) {
        this.tiempoAlto = tiempoAlto;
    }

    @Override
    public String toString() {
        return "Semaforo{" +
                "tiempoAvanzar=" + tiempoAvanzar +
                ", tiempoPreventivo=" + tiempoPreventivo +
                ", tiempoAlto=" + tiempoAlto +
                ", luces=" + Arrays.toString(luces) +
                '}';
    }

    public void avanzar(){
        luces[0].funcion(tiempoAvanzar);
    }

    public void preventivo(){
        luces[1].funcion(tiempoPreventivo);
    }


    public void stop(){
        luces[2].funcion(tiempoAlto);
    }


}
