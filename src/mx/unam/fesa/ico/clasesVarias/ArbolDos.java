package mx.unam.fesa.ico.clasesVarias;

public class ArbolDos {

    private String tipoArbol;
    private String corteza;
    private float altura;
    private int ramas;
    private int hojas;
    private int raices;

    public ArbolDos() {
    }

    public ArbolDos(String tipoArbol, String corteza, float altura, int ramas, int hojas, int raices) {

        this.tipoArbol = tipoArbol;
        this.corteza = corteza;
        this.altura = altura;
        this.ramas = ramas;
        this.hojas = hojas;
        this.raices = raices;
    }

    public String getTipoArbol() {
        return tipoArbol;
    }

    public void setTipoArbol(String tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    public String getCorteza() {
        return corteza;
    }

    public void setCorteza(String corteza) {
        this.corteza = corteza;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura >= 2.0f && altura <= 15.5f) {
            this.altura = altura;
        } else {
            System.out.println("Este tamaño no esta en el rango establecido");
        }
    }

    public int getRamas() {
        return ramas;
    }

    public void setRamas(int ramas) {
        if (ramas >= 0 && ramas <= 100) {
            this.ramas = ramas;
        } else {
            System.out.println("Este número de ramas no esta dentro del rango establecido...");
        }

    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        if (hojas >= 0 && hojas <= 100000) {
            this.hojas = hojas;
        } else {
            System.out.println("Este número de hojas no esta en el rango establecido...");
        }

    }

    public int getRaices() {
        return raices;
    }

    public void setRaices(int raices) {
        if (raices >= 1 && raices <= 20) {
            this.raices = raices;
        } else {
            System.out.println("El número de raices no esta en el rango establecido...");
        }

    }

    @Override
    public String toString() {
        return "ArbolDos{" +
                "tipoArbol='" + tipoArbol + '\'' +
                ", corteza='" + corteza + '\'' +
                ", altura=" + altura +
                ", ramas=" + ramas +
                ", hojas=" + hojas +
                ", raices=" + raices +
                '}';
    }

    public float aumentarAltura(float altura){
        System.out.println("Aumentando altura...");

        return altura;
    }

    public float aumentarGrosor(float grosor){
        System.out.println("Aumentando grosor...");

        return grosor;
    }

    public Boolean romper(){
        System.out.println("Rompiendo arbol...");

        return Boolean.TRUE;
    }

    public Boolean crearHojas(){
        System.out.println("Creando hojas...");

        return Boolean.TRUE;
    }

    public Boolean crearFrutos(){
        System.out.println("Creando frutos...");

        return Boolean.TRUE;
    }

    public float aumentarAnhiosVida(float anhios){

        System.out.println("Aumentando años de vida..."+ anhios + "años");

        return anhios;
    }
}
