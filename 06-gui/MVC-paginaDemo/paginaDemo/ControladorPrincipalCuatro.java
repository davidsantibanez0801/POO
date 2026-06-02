package mx.unam.fesa.ico.MVC.paginaDemo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipalCuatro implements MouseListener {

    private VentanaPrincipalCuatro view;

    public ControladorPrincipalCuatro(VentanaPrincipalCuatro view) {
        this.view = view;

        this.view.getBtnBoton().addMouseListener(this);
        this.view.getLblTexto().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnBoton()){
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
        VentanaPrincipalCuatro v4 =  new VentanaPrincipalCuatro();
        ControladorPrincipalCuatro c4 = new ControladorPrincipalCuatro(v4);
    }

}
