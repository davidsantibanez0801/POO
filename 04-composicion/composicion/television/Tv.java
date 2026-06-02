package mx.unam.fesa.ico.composición.television;

public class Tv {
    private String marca;
    private float precio;
    private int pulgadas;
    private Volumen vol;
    private Canal channel;
    private Pantalla screen;

    public Tv() {
    }

    public Tv(String marca, float precio, int pulgadas, Volumen vol, Canal channel, Pantalla screen) {
        this.marca = marca;
        this.precio = precio;
        this.pulgadas = pulgadas;
        this.vol = vol;
        this.channel = channel;
        this.screen = screen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Volumen getVol() {
        return vol;
    }

    public void setVol(Volumen vol) {
        this.vol = vol;
    }

    public Canal getChannel() {
        return channel;
    }

    public void setChannel(Canal channel) {
        this.channel = channel;
    }

    public Pantalla getScreen() {
        return screen;
    }

    public void setScreen(Pantalla screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", pulgadas=" + pulgadas +
                ", vol=" + vol +
                ", channel=" + channel +
                ", screen=" + screen +
                '}';
    }

    public void estado(){
        System.out.println("Encendido:  "  +  screen.isEncendida());
        System.out.println("Canal:  "  + channel.getCanal());
        System.out.println("Volumen:  "  + vol.getNivel());
    }

    public void subirVolumen(int vs){
        if(this.screen.isEncendida()){
            this.vol.subir(vs);
        }else{
            System.out.println("La television esta apagada");
        }
    }

    public void bajarVolumen(int vb){
        if(this.screen.isEncendida()){
            this.vol.bajar(vb);
        }else{
            System.out.println("La television esta apagada");
        }
    }

    public void subirCanal(){
        if(this.screen.isEncendida()){
            this.channel.canalSiguinete();
        }else{
            System.out.println("la television esta apagada");
        }
    }
}
