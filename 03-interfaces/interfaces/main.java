package mx.unam.fesa.ico.interfaces;

public class main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto etc1 = new EmpleadoTiempoCompleto();
        System.out.println("Salario tiempo completo: " +  etc1.calcularSalario());
        EmpleadoPorHoras eph1 = new EmpleadoPorHoras();
        System.out.println("Salario quincena por hora: " +  eph1.calcularSalario());

    }
}
