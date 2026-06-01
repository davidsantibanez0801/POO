package mx.unam.fesa.ico.clasesVarias;

public class Carro {
    private String color;
    private String modelo;
    private  float precio;
    private int kilometraje;

    public Carro() {
    }

    public Carro(String color, String modelo, float precio, int kilometraje) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if(precio >= 50000 && precio <=10000000 ){
            this.precio = precio;
        }else{
            System.out.println("Este precio no esta en el rango establecido...");
        }
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        if(kilometraje >= 0 && kilometraje <= 300000){

            this.kilometraje = kilometraje;

        }else{
            System.out.println("Este kilometraje no esta en el rango establecido...");
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", kilometraje=" + kilometraje +
                '}';
    }

    public void acelerar(){
        System.out.println("Acelerando carro...");
    }

    public void mover(){
        System.out.println("moviendo carro...");
    }

    public void llevarPasajeros(){
        System.out.println("LLevando pasajeros...");

    }

    public Boolean prender(){
        System.out.println("Prendiendo carro...");

        return Boolean.TRUE;
    }

    public Boolean apagar(){
        System.out.println("apagando carro...");

        return Boolean.TRUE;
    }
}
