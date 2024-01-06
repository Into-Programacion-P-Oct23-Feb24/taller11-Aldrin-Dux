/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int tipo;
        double planilla;
        double planilla2;
        System.out.println("Ingrese el tipo de area a sacar\n(1)Para calcular el"
                + "valor de la planilla de luz\n(2)Para calcular el valor por el"
                + " inmueble");
        tipo = entrada.nextInt();
        if (tipo == 1) {
            entrada.nextLine();
            System.out.println("Ingresar nombre");
            String nombre = entrada.nextLine();

            System.out.println("Ingresar cedula");
            int cedula = entrada.nextInt();
            System.out.println("Ingresar valor del kilovatio");
            double valor = entrada.nextDouble();
            System.out.println("Ingresar cantidad usada");
            double cantidad = entrada.nextDouble();
            planilla = calcularValorLuz(valor, cantidad);
            System.out.printf("Cliente %s con cédula %d debe canelar el "
                    + "valor de: $%.1f\n", nombre, cedula, planilla);
        } else {
            if (tipo == 2) {
                entrada.nextLine();
                System.out.println("Ingresar nombre");
                String nombre2 = entrada.nextLine();

                System.out.println("Ingresar cedula");
                int cedula = entrada.nextInt();
                System.out.println("Ingresar valor del inmueble");
                double valor = entrada.nextDouble();
                planilla2 = calcularPrecio(valor);
                System.out.printf("Cliente %s con cédula %d tiene un bien inmueble"
                        + "valorado en $%.0f y tiene que pagar un precio de $%.0f\n",
                        nombre2, cedula, valor, planilla2);
            } else {
                System.out.println("tipo ingresado es incorrecto");
            }
        }
    }

    public static double calcularValorLuz(double v, double c) {
        double plan;
        plan = v * c;
        return plan;
    }

    public static double calcularPrecio(double v) {
        double inmueble;
        inmueble = (v * 0.02);
        return inmueble;
    }
}
