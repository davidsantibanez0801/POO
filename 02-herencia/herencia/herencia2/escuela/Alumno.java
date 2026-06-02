package mx.unam.fesa.ico.herencia.escuela;

public class Alumno extends Persona{

    private String numDeCuenta;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String numDeCuenta, String carrera) {
        this.numDeCuenta = numDeCuenta;
        this.carrera = carrera;
    }

    public Alumno(String nombre, int edad, String genero, String numDeCuenta, String carrera) {
        super(nombre, edad, genero);
        this.numDeCuenta = numDeCuenta;
        this.carrera = carrera;
    }

    public String getNumDeCuenta() {
        return numDeCuenta;
    }

    public void setNumDeCuenta(String numDeCuenta) {
        this.numDeCuenta = numDeCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numDeCuenta='" + numDeCuenta + '\'' +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void hacerTarea(){
        System.out.println(this.nombre + " Esta haciendo tarea ");
        System.out.println("De temas de la carrera: " + this.carrera);
    }

    public void comer(){
        System.out.println(this.nombre + " Esta comiendo como cerdo...");
    }
}
