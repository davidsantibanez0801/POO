package mx.unam.fesa.ico.tarea8;

public class GestorNotificaciones {
    public void enviarMensaje(Notificable Plataforma, String mensaje, String destinatario){

        Plataforma.hacerMensaje(mensaje, destinatario);

    }
}
