package mx.unam.fesa.ico.clasesVarias;

public class Libro {

    private String tituloDelLibro;
    private String autorDelLibro;
    private int anhoDePublicacion;
    private int cantidadDeEjemplares;

    public Libro() {
    }

    public Libro(String tituloDelLibro, String autorDelLibro, int anhoDePublicacion, int cantidadDeEjemplares) {

        this.tituloDelLibro = tituloDelLibro;
        this.autorDelLibro = autorDelLibro;
        this.anhoDePublicacion = anhoDePublicacion;
        this.cantidadDeEjemplares = cantidadDeEjemplares;

    }

    public String getTituloDelLibro() {
        return tituloDelLibro;
    }

    public void setTituloDelLibro(String tituloDelLibro) {
        this.tituloDelLibro = tituloDelLibro;
    }

    public String getAutorDelLibro() {
        return autorDelLibro;
    }

    public void setAutorDelLibro(String autorDelLibro) {
        this.autorDelLibro = autorDelLibro;
    }

    public int getAnhoDePublicacion() {
        return anhoDePublicacion;
    }

    public void setAnhoDePublicacion(int anhoDePublicacion) {
        if(anhoDePublicacion >= 1900 && anhoDePublicacion <= 2026){
            this.anhoDePublicacion = anhoDePublicacion;
        }else{
            System.out.println("El año de publicación no está en el rango establecido...");
        }

    }

    public int getCantidadDeEjemplares() {
        return cantidadDeEjemplares;
    }

    public void setCantidadDeEjemplares(int cantidadDeEjemplares) {
        if(cantidadDeEjemplares >= 0 && cantidadDeEjemplares <= 100 ){
            this.cantidadDeEjemplares = cantidadDeEjemplares;
        }else{
            System.out.println("La cantidad de ejemplares no esta en el rango establecido...");
        }

    }

    @Override
    public String toString() {
        return "Libro{" +
                "tituloDelLibro='" + tituloDelLibro + '\'' +
                ", autorDelLibro='" + autorDelLibro + '\'' +
                ", anhoDePublicacion=" + anhoDePublicacion +
                ", cantidadDeEjemplares=" + cantidadDeEjemplares +
                '}';
    }

    public Boolean prestarLibro(){
        System.out.println("prestando libro...");

        return Boolean.TRUE;
    }

    public Boolean regresarLibro (){
        System.out.println("regresando libro...");

        return Boolean.TRUE;
    }

    public void verSeccionDeLibro(){
        System.out.println("viendo seccion de libro...");

    }
}

