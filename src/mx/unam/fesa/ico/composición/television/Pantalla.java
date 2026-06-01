package mx.unam.fesa.ico.composición.television;

public class Pantalla {

    private boolean encendida;

    public Pantalla() {
    }

    public Pantalla(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "encendida=" + encendida +
                '}';
    }

    public boolean encender(){
        this.encendida = true;
        return this.encendida;
    }

    public boolean apagar(){
        this.encendida = false;
        return this.encendida;
    }


}
