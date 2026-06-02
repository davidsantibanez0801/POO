package mx.unam.fesa.ico.MVC.paginaDemo;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipalUno extends JFrame {

    private JPanel pnlPanelUno;
    private JPanel pnlPanelDos;
    private JTextField txtEntrada;
    private JLabel lblLabel;
    private JButton btnBoton;
    private JLabel lblSalida;

    public VentanaPrincipalUno() throws HeadlessException {
        super("VentanaPrincipalUno");
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));


        pnlPanelUno = new JPanel();
        pnlPanelDos = new JPanel();

        pnlPanelUno.setBackground(new Color(40, 168, 156));
        pnlPanelDos.setBackground(new Color(34, 122, 200));

        lblLabel = new JLabel("Escribe tu nombre: ");
        txtEntrada = new JTextField(10);
        btnBoton = new JButton("Enter");
        lblSalida = new JLabel("...");

        pnlPanelUno.add(lblLabel);
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

    public JTextField getTxtEntrada() {
        return txtEntrada;
    }

    public void setTxtEntrada(JTextField txtEntrada) {
        this.txtEntrada = txtEntrada;
    }

    public JLabel getLblLabel() {
        return lblLabel;
    }

    public void setLblLabel(JLabel lblLabel) {
        this.lblLabel = lblLabel;
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
        return "VentanaPrincipalUno{" +
                "pnlPanelUno=" + pnlPanelUno +
                ", pnlPanelDos=" + pnlPanelDos +
                ", txtEntrada=" + txtEntrada +
                ", lblLabel=" + lblLabel +
                ", btnBoton=" + btnBoton +
                ", lblSalida=" + lblSalida +
                '}';
    }

}
