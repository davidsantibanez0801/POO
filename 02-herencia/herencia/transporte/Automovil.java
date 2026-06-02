package mx.unam.fesa.ico.herencia.transporte;

public class Automovil extends Vehiculo{
    private int numeroPuertas;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numeroPuertas=" + numeroPuertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void encenderMotor(){
        System.out.println("El automovil ha sido encendido...");
    }
}
