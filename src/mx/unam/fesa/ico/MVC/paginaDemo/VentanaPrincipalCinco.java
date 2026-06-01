package mx.unam.fesa.ico.MVC.paginaDemo;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipalCinco extends JFrame {

    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lbltexto;
    private JTextField txtEntrada;
    private JButton btbBoton;
    private JLabel lblSalida;

    public VentanaPrincipalCinco() throws HeadlessException {
        super("Ventana principal Quinta");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2,1));

        pnlPanel1 = new JPanel();
        pnlPanel2 =  new JPanel();

        pnlPanel1.setBackground(new Color(53, 207, 186));
        pnlPanel2.setBackground(new Color(71, 191, 105));

        lbltexto = new JLabel("Ingresa tu edad");
        txtEntrada =  new JTextField(10);
        btbBoton = new JButton("Saludar");
        lblSalida = new JLabel("...");

        pnlPanel1.add(lbltexto);
        pnlPanel1.add(txtEntrada);
        pnlPanel1.add(btbBoton);
        pnlPanel1.add(lblSalida);

        getContentPane().add(pnlPanel1,0);
        getContentPane().add(pnlPanel2,1);


    }

    @Override
    public String toString() {
        return "VentanaPrincipalCinco{" +
                "pnlPanel1=" + pnlPanel1 +
                ", pnlPanel2=" + pnlPanel2 +
                ", lbltexto=" + lbltexto +
                ", txtEntrada=" + txtEntrada +
                ", btbBoton=" + btbBoton +
                ", lblSalida=" + lblSalida +
                '}';
    }

    public JPanel getPnlPanel1() {
        return pnlPanel1;
    }

    public void setPnlPanel1(JPanel pnlPanel1) {
        this.pnlPanel1 = pnlPanel1;
    }

    public JPanel getPnlPanel2() {
        return pnlPanel2;
    }

    public void setPnlPanel2(JPanel pnlPanel2) {
        this.pnlPanel2 = pnlPanel2;
    }

    public JLabel getLbltexto() {
        return lbltexto;
    }

    public void setLbltexto(JLabel lbltexto) {
        this.lbltexto = lbltexto;
    }

    public JTextField getTxtEntrada() {
        return txtEntrada;
    }

    public void setTxtEntrada(JTextField txtEntrada) {
        this.txtEntrada = txtEntrada;
    }

    public JButton getBtbBoton() {
        return btbBoton;
    }

    public void setBtbBoton(JButton btbBoton) {
        this.btbBoton = btbBoton;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }

}
