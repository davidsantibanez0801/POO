package mx.unam.fesa.ico.tarea8;

public class Whatsapp implements Notificable , Cifrar {

    @Override
    public String cifrar(String texto) {
        return "@@@" + texto + "&&&";
    }

    @Override
    public void hacerMensaje(String mensaje, String destinatario) {
         String mensajeSeguro = cifrar(mensaje);
        System.out.println("Enviando whatsapp a :" + destinatario + "con mensaje: "+ mensajeSeguro);
    }

}
