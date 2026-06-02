package mx.unam.fesa.ico.MVC.paginaDemo;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipalCuatro extends JFrame {

    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblTexto;
    private JTextField txtEntrada;
    private JButton btnBoton;
    private JLabel lblSalida;

    public VentanaPrincipalCuatro() throws HeadlessException {
        super("Ventana Principal Cuatro");
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));

        pnlPanel1 = new JPanel();
        pnlPanel2 = new JPanel();

        pnlPanel2.setBackground(new Color(221, 227, 68));
        pnlPanel1.setBackground(new Color(193, 169, 243));

        lblTexto = new JLabel("Ingresa tu edad");
        txtEntrada = new JTextField(10);
        btnBoton = new JButton("Saludar");
        lblSalida =  new JLabel("...");

        pnlPanel1.add(lblTexto);
        pnlPanel1.add(txtEntrada);
        pnlPanel1.add(btnBoton);
        pnlPanel1.add(lblSalida);

        getContentPane().add(pnlPanel1,0);
        getContentPane().add(pnlPanel2,1);

    }

    @Override
    public String toString() {
        return "VentanaPrincipalCuatro{" +
                "pnlPanel1=" + pnlPanel1 +
                ", pnlPanel2=" + pnlPanel2 +
                ", lblTexto=" + lblTexto +
                ", txtEntrada=" + txtEntrada +
                ", btnBoton=" + btnBoton +
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

    public JLabel getLblTexto() {
        return lblTexto;
    }

    public void setLblTexto(JLabel lblTexto) {
        this.lblTexto = lblTexto;
    }

    public JTextField getTxtEntrada() {
        return txtEntrada;
    }

    public void setTxtEntrada(JTextField txtEntrada) {
        this.txtEntrada = txtEntrada;
    }

    public JButton getBtnBoton() {
        return btnBoton;
    }

    public void setBtnBoton(JButton btnBoton) {
        this.btnBoton = btnBoton;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }

}
