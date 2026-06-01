package mx.unam.fesa.ico.MVC.paginaDemo;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipalTres extends JFrame {

    private JPanel pnlPanelUno;
    private JPanel pnlPanelDos;
    private JLabel lblTexto;
    private JTextField txtEntrada;
    private JButton btnBoton;
    private JLabel lblSalida;

    public VentanaPrincipalTres() throws HeadlessException {
        super("Ventana principal Tres");
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));

        pnlPanelUno = new JPanel();
        pnlPanelDos = new JPanel();

        pnlPanelUno.setBackground(new Color(131, 70, 43));
        pnlPanelDos.setBackground(new Color(160, 28, 207));

        lblTexto = new JLabel("Ingresa tu nombre");
        txtEntrada = new JTextField(10);
        btnBoton =  new JButton("Saludar");
        lblSalida = new JLabel("...");

        pnlPanelUno.add(lblTexto);
        pnlPanelUno.add(txtEntrada);
        pnlPanelUno.add(btnBoton);
        pnlPanelUno.add(lblSalida);

        getContentPane().add(pnlPanelUno,0);
        getContentPane().add(pnlPanelDos,1);

    }

    public JPanel getPnlPanelUno() {
        return pnlPanelUno;
    }

    public void setPnlPanelUno(JPanel pnlPanelUno) {
        this.pnlPanelUno = pnlPanelUno;
    }

    public JPanel getPnlPanelDos() {
        return pnlPanelDos;
    }

    public void setPnlPanelDos(JPanel pnlPanelDos) {
        this.pnlPanelDos = pnlPanelDos;
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

    @Override
    public String toString() {
        return "VentanaPrincipalTres{" +
                "pnlPanelUno=" + pnlPanelUno +
                ", pnlPanelDos=" + pnlPanelDos +
                ", lblTexto=" + lblTexto +
                ", txtEntrada=" + txtEntrada +
                ", btnBoton=" + btnBoton +
                ", lblSalida=" + lblSalida +
                '}';
    }

    public static void main(String[] args) {
        VentanaPrincipalTres v3 =  new VentanaPrincipalTres();
    }
}
