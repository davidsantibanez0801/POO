package mx.unam.fesa.ico.tarea8;

import java.util.ArrayList;

public class MainMensajes {
    public static void main(String[] args) {
        ArrayList<Notificable> sistema = new ArrayList<>();
        sistema.add(new Email());
        sistema.add(new Whatsapp());
        sistema.add(new Sms());

      for (int i=0; i < sistema.size(); i++){
          sistema.get(i).hacerMensaje("Hola este es un mensaje!!!", "Usuario " + i +" ");
      }
    }
}
