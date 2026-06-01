package mx.unam.fesa.ico.interfaces;

public class EmpleadoPorHoras implements Empleado{

    private static final float TARIFA_POR_HORA = 7.50f;
    private static final int HORAS_POR_QUINCENA = 64;


    @Override
    public float calcularSalario() {
        return (TARIFA_POR_HORA * HORAS_POR_QUINCENA);
    }
}
