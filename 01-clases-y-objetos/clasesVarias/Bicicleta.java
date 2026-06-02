package mx.unam.fesa.ico.clasesVarias;

public class Bicicleta {

    private String color;
    private float altura;
    private float ancho;
    private int velocidad;
    private String material;

    public Bicicleta() {
    }

    public Bicicleta(String color, float altura, float ancho, int velocidad, String material) {
        this.color = color;
        this.altura = altura;
        this.ancho = ancho;
        this.velocidad = velocidad;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura >= 40f && altura <= 70f){
            this.altura = altura;

        }else{
            System.out.println("Esta altura no esta en el rango establecido...");
        }
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        if(ancho >= 30f && ancho <= 45f){
            this.ancho = ancho;
        }else {
            System.out.println("Este ancho no esta en el rango establecido...");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0 && velocidad <= 40){
            this.velocidad = velocidad;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "color='" + color + '\'' +
                ", altura=" + altura +
                ", ancho=" + ancho +
                ", velocidad=" + velocidad +
                ", material='" + material + '\'' +
                '}';
    }

    public Boolean moverAdelante(float d){
        System.out.println("moviendo hacia adelante "+ d+ "metros");

        return Boolean.TRUE;
    }

    public Boolean girarIzquierda(int i){
        System.out.println("mover hacia la izquierda" + i + "metros");

        return Boolean.TRUE;
    }

    public Boolean girarDerecha(int r){
        System.out.println("mover hacia la derecha "+ r+ "metros");

        return Boolean.TRUE;
    }

    public void frenar(){
        System.out.println("Freanar...");

    }


}
