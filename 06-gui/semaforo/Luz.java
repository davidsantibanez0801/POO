package mx.unam.fesa.ico.semaforo;

public class Luz {

    private boolean encendida;
    private String colorDeLuz;
    private  int tiempoDeEncendidio;

    public Luz() {
    }

    public Luz(boolean encendida, String colorDeLuz, int tiempoDeEncendidio) {
        this.encendida = encendida;
        this.colorDeLuz = colorDeLuz;
        this.tiempoDeEncendidio = tiempoDeEncendidio;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public String getColorDeLuz() {
        return colorDeLuz;
    }

    public void setColorDeLuz(String colorDeLuz) {
        this.colorDeLuz = colorDeLuz;
    }

    public int getTiempoDeEncendidio() {
        return tiempoDeEncendidio;
    }

    public void setTiempoDeEncendidio(int tiempoDeEncendidio) {
        this.tiempoDeEncendidio = tiempoDeEncendidio;
    }

    @Override
    public String toString() {
        return "Luz{" +
                "encendida=" + encendida +
                ", colorDeLuz='" + colorDeLuz + '\'' +
                ", tiempoDeEncendidio=" + tiempoDeEncendidio +
                '}';
    }

    public boolean apagar(){
        this.encendida = false;
        System.out.println("luz " + colorDeLuz + " apagada...");
        return this.encendida;
    }

    public boolean encender(){
        this.encendida = true;
        System.out.println("luz "+ colorDeLuz + " encendida...");
        return this.encendida;
    }

    public void funcion(int tiempoDeEncendidio){
        encender();
        for(int i = tiempoDeEncendidio;i > 0;i-- ){

            System.out.println("sigue Encendidio por " + i +  "...");

        }
        apagar();
    }
}
