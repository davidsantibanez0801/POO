package mx.unam.fesa.ico.herencia.escuela;

public class Prueba {
    public static void main(String[] args) {
        Persona per1 = new Persona("Luis", 18, "Masculino");
        System.out.println(per1);
        per1.hablar();
        per1.comer();

        System.out.println("-------------------------");

        Alumno al1 = new Alumno("Juan" , 18, "Masculino", "32324252652", "iCO" );
        System.out.println(al1);
        al1.dormir();
        al1.hacerTarea();
        al1.comer();
    }
}
