package mx.unam.fesa.ico.MVC.paginaDemo;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipalDos extends JFrame {

    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private  JLabel lblTexto;
    private  JTextField txtEntrada;
    private JButton btnButton;
    private  JLabel lblSalida;

    public VentanaPrincipalDos() throws HeadlessException {
        super("Ventana Principal Dos");
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));

        pnlPanel1 = new JPanel();
        pnlPanel2 = new JPanel();

        pnlPanel1.setBackground(new Color(98, 168, 40));
        pnlPanel2.setBackground(new Color(41, 69, 99));

        lblTexto = new JLabel("Escribe tu nombre: ");
        txtEntrada = new JTextField(10);
        btnButton = new JButton("Saludar");
        lblSalida =  new JLabel("...");

        pnlPanel1.add(lblTexto);
        pnlPanel1.add(txtEntrada);
        pnlPanel1.add(btnButton);
        pnlPanel1.add(lblSalida);

        getContentPane().add(pnlPanel1,0);
        getContentPane().add(pnlPanel2,1);


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

    public JButton getBtnButton() {
        return btnButton;
    }

    public void setBtnButton(JButton btnButton) {
        this.btnButton = btnButton;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }

    @Override
    public String toString() {
        return "VentanaPrincipalDos{" +
                "pnlPanel1=" + pnlPanel1 +
                ", pnlPanel2=" + pnlPanel2 +
                ", lblTexto=" + lblTexto +
                ", txtEntrada=" + txtEntrada +
                ", btnButton=" + btnButton +
                ", lblSalida=" + lblSalida +
                '}';
    }


}
