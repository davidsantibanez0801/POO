package mx.unam.fesa.ico.herencia.transporte;

public class Prueba {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Nissan", "GT R");
        Automovil a1 = new Automovil("Mustang", "Shelvi", 2);
        v1.mostrarInformacion();
        a1.encenderMotor();
    }

}
