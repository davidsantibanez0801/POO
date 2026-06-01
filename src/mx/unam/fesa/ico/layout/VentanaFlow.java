package mx.unam.fesa.ico.layout;

import java.awt.*;
import java.awt.event.*;

public class VentanaFlow extends Frame {

    public VentanaFlow() throws HeadlessException {
    }

    public VentanaFlow(String title, int ancho, int alto) throws HeadlessException {
        super(title);
        setSize(ancho,alto);

        Button boton1 = new Button("Boton 1");
        TextField text = new TextField();
        this.setLayout(new FlowLayout());

        this.add(boton1);
        this.add(text);
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
        new VentanaFlow("Ventana flowLayout", 800, 400);
    }
}
