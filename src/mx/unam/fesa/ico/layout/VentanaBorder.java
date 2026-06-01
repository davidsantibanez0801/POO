package mx.unam.fesa.ico.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaBorder extends Frame {
    Button btn1 = new Button("Arriba");
    Button btn2 = new Button("Izquierda");
    Button btn3 = new Button("Derecha");
    Button btn4 = new Button("Abajo");

    public VentanaBorder(String title) throws HeadlessException {
        super("Ventana con eventos");
        setSize(800,500);
        setResizable(false);
        setLayout(new BorderLayout());

        this.setVisible(true);


        add("North",btn1);
        add("West",btn2);
        add("East", btn3);
        add("South",btn4);

        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                        System.exit(0);
                    }
                }
        );
    }

    public static void main(String[] args) {
        VentanaBorder ventanaB = new VentanaBorder("titulo increible");
    }
}
