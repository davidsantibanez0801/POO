package mx.unam.fesa.ico.excepciones;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CalculadoraIMC calIMC = new CalculadoraIMC();
        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println("Ingrese su peso:  ");
            calIMC.setPeso(teclado.nextDouble());

            System.out.println("Ingrese su altura:  ");
            calIMC.setAltura(teclado.nextDouble());

            calIMC.calcularIMC();

            System.out.println("Su IMC es de " + calIMC.getImc());
        }catch (Exception e){
            System.out.println("Error!! Revisa tu entrada");
        }

    }
}
