package mx.unam.fesa.ico.MVC.paginaDemo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipalUno implements MouseListener {

    private VentanaPrincipalUno view;

    public ControladorPrincipalUno(VentanaPrincipalUno vista) {
        this.view = vista;
        this.view.getBtnBoton().addMouseListener(this);
        this.view.getTxtEntrada().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnBoton()){
            this.view.getLblSalida().setText("Hola " + this.view.getTxtEntrada().getText());
        }
        if (e.getSource() == this.view.getTxtEntrada()){
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
        VentanaPrincipalUno v1 = new VentanaPrincipalUno();
        ControladorPrincipalUno c1 = new ControladorPrincipalUno(v1);
    }
}
