package mx.unam.fesa.ico.herencia.biblioteca;

public class  Bibliotecario  extends  Persona{

    private String numeroEmpleado;

    public Bibliotecario() {
    }

    public Bibliotecario(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Bibliotecario(String nombre, int edad, String numeroEmpleado) {
        super(nombre, edad);
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "numeroEmpleado='" + numeroEmpleado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void registrarPrestamo(){
        System.out.println("El biblitecario "+ this.nombre + " esta realizando un prestamo");
    }
}
