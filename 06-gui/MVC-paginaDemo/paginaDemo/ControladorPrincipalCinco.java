package mx.unam.fesa.ico.MVC.paginaDemo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipalCinco implements MouseListener {

    private VentanaPrincipalCinco view;

    public ControladorPrincipalCinco(VentanaPrincipalCinco vista) {
        this.view = vista;
        this.view.getBtbBoton().addMouseListener(this);
        this.view.getLbltexto().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.view.getBtbBoton()){
            this.view.getLblSalida().setText("Hola "+ this.view.getTxtEntrada().getText());
        }
        if (e.getSource()== this.view.getLbltexto()){
            System.out.println("Hola desde la etiqueta ");
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
        VentanaPrincipalCinco v5 = new VentanaPrincipalCinco();
        ControladorPrincipalCinco c5 = new ControladorPrincipalCinco(v5);
    }
}
