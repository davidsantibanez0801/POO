package mx.unam.fesa.ico.herencia.sistemaEscolar;

public class Profesor extends Persona {
    private String materia;

    public Profesor() {
    }

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void impartirClase(){
        System.out.println("El profesor " + this.nombre + " esta impartiendo la materia de: " + this.materia);
    }
}
