package mx.unam.fesa.ico.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazIMC extends Frame {

    public InterfazIMC(String title) throws HeadlessException {
        super(title);
        setSize(800,600);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        Label textoAltura = new Label("Altura en metros: ");
        TextField cuadroDeAltura = new TextField(7);
        Label textoPeso = new Label("Peso en kg: ");
        TextField cuadroDePeso = new TextField(7);
        Button botonCalculo = new Button("Calcular");
        Label textoIMC = new Label("Tu IMC es: ");
        TextField cuadroDeIMC = new TextField(10);

        this.add(textoAltura);
        this.add(cuadroDeAltura);
        this.add(textoPeso);
        this.add(cuadroDePeso);
        this.add(botonCalculo);
        this.add(textoIMC);
        this.add(cuadroDeIMC);
        botonCalculo.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        double peso = Double.parseDouble(cuadroDePeso.getText());
                        double altura = Double.parseDouble(cuadroDeAltura.getText());
                        double imc = (peso /(altura * altura));
                        cuadroDeIMC.setText(String.valueOf(imc));
                    }
                }
        );


        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }

    public static void main(String[] args) {
        InterfazIMC ventana = new InterfazIMC("Calculadora de IMC ");
    }
}
