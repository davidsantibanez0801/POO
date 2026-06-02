package mx.unam.fesa.ico.herencia.reloj;
import java.time.LocalDateTime;

public class Reloj {
    protected int hora;
    protected int minuto;
    protected int segundo;
    protected boolean enEjecucion;

    public Reloj() {
        LocalDateTime actual = LocalDateTime.now();
        hora = actual.getHour();
        minuto = actual.getMinute();
        segundo = actual.getSecond();
        enEjecucion = true;
    }

    public Reloj(int hora, int minuto, int segundo, boolean enEjecucion) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.enEjecucion = enEjecucion;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public boolean isEnEjecucion() {
        return enEjecucion;
    }

    public void setEnEjecucion(boolean enEjecucion) {
        this.enEjecucion = enEjecucion;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                ", enEjecucion=" + enEjecucion +
                '}';
    }

    public void incrementarSegundo(){
        this.segundo++;
        if(this.segundo == 60){
            this.segundo =0;
            incrementarMinuto();
        }
    }

    public void incrementarMinuto(){
        this.minuto++;
        if(this.minuto == 60){
            this.minuto=0;
            incrementarHora();
        }
    }

    public void incrementarHora(){
        this.hora++;
        if(this.hora == 24){
            this.hora = 0;
        }
    }

}
