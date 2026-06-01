package mx.unam.fesa.ico.composicion.candado;

public class Engrane {
    private  int posicion;

    public Engrane() {
    }

    public Engrane(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Engrane{" +
                "posicion=" + posicion +
                '}';
    }

    public void girar(int pos){
        this.posicion = (this.posicion + pos)%10;
    }
}
