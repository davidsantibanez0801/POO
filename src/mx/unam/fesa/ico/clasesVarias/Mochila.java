package mx.unam.fesa.ico.clasesVarias;

public class Mochila {
    private String color;
    private boolean abierto;
    private float costo;
    private String tamanhio;
    private int numCierres;

    public Mochila() {
    }

    public Mochila(String color, boolean abierto, float costo, String tamanhio, int numCierres) {
        this.color = color;
        this.abierto = abierto;
        this.costo = costo;
        this.tamanhio = tamanhio;
        this.numCierres = numCierres;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {

        this.abierto = abierto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        if(costo >= 250.50 && costo <= 2000.50 ){
            this.costo = costo;

        }else{
            System.out.println("Este costo no esta en el rang establecido...");
        }
    }

    public String getTamanhio() {
        return tamanhio;
    }

    public void setTamanhio(String tamanhio) {
        this.tamanhio = tamanhio;
    }

    public int getNumCierres() {
        return numCierres;
    }

    public void setNumCierres(int numCierres) {
        if(numCierres >= 1 &&  numCierres <= 8){
            this.numCierres = numCierres;

        }else{
            System.out.println("Este número de cierres no esta en el rango establecido...");
        }
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "color='" + color + '\'' +
                ", abierto=" + abierto +
                ", costo=" + costo +
                ", tamanhio='" + tamanhio + '\'' +
                ", numCierres=" + numCierres +
                '}';
    }

    public Boolean abrir(){
        System.out.println("Abriendo mochila...");

        return Boolean.TRUE;
    }

    public Boolean cerrar(){
        System.out.println("Cerrando puerta...");

        return Boolean.TRUE;
    }

    public void guardar(){

        System.out.println("Guardando...");
    }

    public void mover(){
        System.out.println("Moviendo mochila...");
    }
}
