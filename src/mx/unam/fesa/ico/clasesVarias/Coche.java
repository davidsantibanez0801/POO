package mx.unam.fesa.ico.clasesVarias;

public class Coche {
    private String marca;
    private String modelo;
    private String color;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Boolean encenderAuto(){
        System.out.println("Encendiendo coche...");

        return Boolean.TRUE;
    }

    public Boolean apagarAuto(){
        System.out.println("Apagando coche ...");

        return Boolean.TRUE;
    }

    public void acelerar(){
        System.out.println("acelerando coche...");
    }

    public void frenar(){
        System.out.println("Frenando coche...");
    }
}
