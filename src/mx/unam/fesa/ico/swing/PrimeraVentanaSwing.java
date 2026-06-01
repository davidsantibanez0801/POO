package mx.unam.fesa.ico.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrimeraVentanaSwing extends JFrame {
    private JLabel etiqueta;
    private  JTextField entrada;
    private JButton boton;


    public PrimeraVentanaSwing() throws HeadlessException {
        super("--Ventana--");
        setSize(600,600);
        getContentPane().setLayout(new GridLayout(3,3));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        etiqueta = new JLabel("Dame un numero");
        etiqueta.setForeground(new Color(34, 122, 200));
        entrada = new JTextField(10);
        boton = new JButton("Enviar");
        boton.setForeground(new Color(255, 1, 21));
        boton.setBackground(new Color(0,0,0));
        boton.setSize(100,100);

        getContentPane().add(etiqueta,0);
        getContentPane().add(entrada,1);
        getContentPane().add(boton,2);

        boton.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        double entradaCelicus = Double.parseDouble(entrada.getText());
                        double gradosFarenheit = (entradaCelicus * 9 / 5 )+ 32;
                        JOptionPane.showMessageDialog(null, "El grado Farenheit es: " + gradosFarenheit);

                    }
                }
        );

        entrada.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("Hola desde el clic de la pagina");
                    }
                }
        );

        entrada.addKeyListener(
                new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        System.out.println(" hola desde el key al cuadro de entrada");
                        System.out.println(e.getKeyChar());
                        //System.out.println("Codigo de la tecla : " + e.getKeyCode());
                    }
                }
        );



    }

    public static void main(String[] args) {
        PrimeraVentanaSwing ventanaUno = new PrimeraVentanaSwing();
    }
}
