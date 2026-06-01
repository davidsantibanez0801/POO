package mx.unam.fesa.ico.swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaDos extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel etiqueta;
    private JButton boton;
    private JComboBox<String> comboBox;

    public VentanaDos(){
        super("Mi segunda ventana swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);
        layout = new GridLayout(2,2);
        getContentPane().setLayout(layout);

        boton = new JButton("soy un boton");
        etiqueta =  new JLabel("Soy un label");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        comboBox = new JComboBox<>();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("juan");
        nombres.add("pedro");
        nombres.add("Gabo");
        nombres.add("Parrales");
        nombres.add("Orlando");

        ModeloComboNombres modelo = new ModeloComboNombres(nombres);

        comboBox.setModel(modelo);

        panel1.setBackground(new Color(40, 168, 156));
        panel2.setBackground(new Color(98, 168, 40));
        panel3.setBackground(new Color(69, 67, 66));
        panel4.setBackground(new Color(225, 126, 84));

        getContentPane().add(panel1,0);
        getContentPane().add(panel2,1);
        getContentPane().add(panel3,2);
        getContentPane().add(panel4,3);

        panel1.add(etiqueta);
        panel2.add(boton);
        panel3.add(comboBox);
    }

    public static void main(String[] args) {
        VentanaDos venatana = new VentanaDos();
    }

}
