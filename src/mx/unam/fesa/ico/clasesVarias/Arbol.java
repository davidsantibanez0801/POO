package mx.unam.fesa.ico.clasesVarias;

public class Arbol {

    private float tamanio;
    private int edad;
    private  String color;

    public Arbol() {
    }

    public Arbol(float tamanio, int edad, String color) {
        this.tamanio = tamanio;
        this.edad = edad;
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        if(tamanio >= 2.0f && tamanio <= 15.5f){
            this.tamanio = tamanio;
        }else{
            System.out.println("Este tamaño no esta en el rango establecido");
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0 && edad <= 322){
            this.edad = edad;
        }else{
            System.out.println("Esta edad no esta en el rango establecido");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "tamanio=" + tamanio +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    public void crecer(){
        System.out.println("Arbol creciendo...");
    }

    public void desgastar(){
        System.out.println("Arbol desgastando...");
    }

    public Boolean darFrutas(){
        System.out.println("Dando frutas...");

        return Boolean.TRUE;
    }
}
