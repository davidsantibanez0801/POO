package mx.unam.fesa.ico.MVC.paginaDemo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipalTres implements MouseListener {

    private VentanaPrincipalTres view;

    public ControladorPrincipalTres(VentanaPrincipalTres vista) {
        this.view = vista;
        this.view.getBtnBoton().addMouseListener(this);
        this.view.getLblTexto().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==this.view.getBtnBoton()){
            this.view.getLblSalida().setText(("Hola " + this.view.getTxtEntrada().getText()));
        }
        if (e.getSource()==this.view.getLblTexto()){
            System.out.println("Hola dsesde la etiqueta");
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
        VentanaPrincipalTres v3 = new VentanaPrincipalTres();
        ControladorPrincipalTres c3 = new ControladorPrincipalTres(v3);
    }
}
