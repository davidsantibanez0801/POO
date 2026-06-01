package mx.unam.fesa.ico.interfaces;

public class EmpleadoTiempoCompleto implements Empleado {

    private static final float SUELDO_MENSUAL_PACTADO = 2400.00f;
    private static final int DIAS_DEL_MES = 30;


    @Override
    public float calcularSalario(){

       return SUELDO_MENSUAL_PACTADO/DIAS_DEL_MES;

    }
}
