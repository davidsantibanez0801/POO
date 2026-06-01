package mx.unam.fesa.ico.tarea8;

public class Email implements Notificable, Cifrar{

    @Override
    public String cifrar(String texto) {
        return "///" + texto + "###";
    }

    @Override
    public void hacerMensaje(String mensaje, String destinatario) {
        String mensajeSeguro = cifrar(mensaje);
        System.out.println("Enviando Email a :"+ destinatario +  ":" + mensajeSeguro);
    }
}
