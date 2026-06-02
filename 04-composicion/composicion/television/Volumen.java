package mx.unam.fesa.ico.composición.television;

public class Volumen {

    private int nivel;

    public Volumen() {
    }

    public Volumen(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if(nivel>=0 && nivel<= 100){
            this.nivel = nivel;
        }else System.out.println("este valor excede los limites");

    }

    @Override
    public String toString() {
        return "Volumen{" +
                "nivel=" + nivel +
                '}';
    }

    public void subir(int nivelesSubir){
        this.setNivel(this.getNivel() + nivelesSubir);
    }

    public void bajar(int nivelesBajar){
        this.setNivel(this.getNivel() - nivelesBajar);
    }


}
