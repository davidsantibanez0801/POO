package mx.unam.fesa.ico.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrid extends Frame {
    Button btn1 = new Button("Primer boton ");
    Button btn2 = new Button("Segundo boton ");
    Button btn3 = new Button("push ");
    Button btn4 = new Button("turn off");

    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        setSize(800,500);
        setResizable(false);
        setLayout(new GridLayout(2,2));

        add(btn1, 0);
        add(btn2, 1);
        add(btn3, 2);
        add(btn4, 3);

        this.setVisible(true);

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
        VentanaGrid venatnaG = new VentanaGrid("Hola que hace jeje");
    }
}


