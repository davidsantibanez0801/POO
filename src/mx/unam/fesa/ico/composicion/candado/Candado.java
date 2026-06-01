package mx.unam.fesa.ico.composicion.candado;

import java.util.Arrays;

public class Candado {
 private static final int NUMERO_DE_ENGRANES = 3;
 private String combinacio;
 private boolean abierto;
 private Engrane engranes[];

    public Candado() {
        engranes = new Engrane[NUMERO_DE_ENGRANES];

       engranes[0] = new Engrane();
       engranes[1] = new Engrane();
       engranes[2] = new Engrane();


    }

    public Candado(String combinacio, boolean abierto, Engrane[] engranes) {
        this.combinacio = combinacio;
        this.abierto = abierto;
        this.engranes = engranes;
    }

    public String getCombinacio() {
        return combinacio;
    }

    public void setCombinacio(String combinacio) {
        this.combinacio = combinacio;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }


    @Override
    public String toString() {
        return "Candado{" +
                "combinacio='" + combinacio + '\'' +
                ", abierto=" + abierto +
                ", engranes=" + Arrays.toString(engranes) +
                '}';
    }

    public void cerrar(){
        this.abierto = false;
    }

    public boolean abrir(){
        String actual= "";
        actual = actual + engranes[0].getPosicion();
        actual = actual + engranes[1].getPosicion();
        actual = actual + engranes[2].getPosicion();
        System.out.println(actual);

        if(this.combinacio.equals(actual)){
            System.out.println("El candado esta abierto...");
        }else{
            System.out.println("combinacion incorrecta...");
        }
        return this.abierto;
    }

    public void girarEngrane(int eng, int pos){

        switch (eng){
            case 0:
                engranes[0].girar(pos);
                break;
            case 1:
                engranes[1].girar(pos);
                break;
            case 2:
                engranes[2].girar(pos);
                break;
            default:
                System.out.println("Ese numero de engranes no existe");
        }
    }
}
