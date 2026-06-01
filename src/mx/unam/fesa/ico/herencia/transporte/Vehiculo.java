package mx.unam.fesa.ico.herencia.transporte;

public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println("Marca del vehiculo: " + this.marca);
        System.out.println("Modelo del vehiculo: " + this.modelo);
    }
}
