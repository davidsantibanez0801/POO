package mx.unam.fesa.ico.MVC.paginaDemo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipalDos implements MouseListener {

    private VentanaPrincipalDos view;

    public ControladorPrincipalDos(VentanaPrincipalDos vista) {
        this.view = vista;
        this.view.getBtnButton().addMouseListener(this);
        this.view.getLblTexto().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.view.getBtnButton()){
            this.view.getLblSalida().setText("Hola " + this.view.getTxtEntrada().getText());
        }
        if (e.getSource() == this.view.getLblTexto()){
            System.out.println("Hola desde la etiqueta");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        VentanaPrincipalDos v2 =  new VentanaPrincipalDos();
        ControladorPrincipalDos c2 = new ControladorPrincipalDos(v2);
    }
}
