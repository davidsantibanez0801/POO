package mx.unam.fesa.ico.tarea8;

public class Sms implements Notificable{
    @Override
    public void hacerMensaje(String mensaje, String destinatario) {
        System.out.println("Enviando SMS al número: " + destinatario + "con el mensaje: " + mensaje);
    }
}
