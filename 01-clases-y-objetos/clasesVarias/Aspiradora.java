package mx.unam.fesa.ico.clasesVarias;

public class Aspiradora {

    private String marca;
    private float precio;
    private String forma;
    private float capacidad;
    private float bateria;

    public Aspiradora() {
    }

    public Aspiradora(String marca, float precio, String forma, float capacidad, float bateria) {
        this.marca = marca;
        this.precio = precio;
        this.forma = forma;
        this.capacidad = capacidad;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if(precio >= 84.5 && precio <= 5670.5){
            this.precio = precio;
        }else {
            System.out.println("El precio no esta en el rango establecido...");
        }

    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        if(capacidad >= 0.0 && capacidad <= 15.5){

            this.capacidad = capacidad;
        }else{
            System.out.println("Esta capacidad no esta en el rango establecido...");
        }

    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        if(bateria >= 0.0 && bateria <=2500.0){
            this.bateria = bateria;
        }else{
            System.out.println("La capacidad de la bateria esta fuera de rango...");
        }

    }

    @Override
    public String toString() {
        return "Aspiradora{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", forma='" + forma + '\'' +
                ", capacidad=" + capacidad +
                ", bateria=" + bateria +
                '}';
    }

    public Boolean aspirar(){
        System.out.println("Aspirando...");

        return Boolean.TRUE;
    }

    public Boolean encender(){
        System.out.println("Encendidendo...");

        return Boolean.TRUE;
    }

    public Boolean apagar(){
        System.out.println("Apagando...");

        return Boolean.TRUE;
    }

    public float soportarBasura(float d){
        System.out.println("Soportando basura..." +  d + "kilogramos");
        return d;
    }
}
