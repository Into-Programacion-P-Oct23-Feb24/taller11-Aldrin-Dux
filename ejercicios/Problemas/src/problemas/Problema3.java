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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese valor de la nota 1");
        double nota1 = entrada.nextDouble();
        System.out.println("Ingrese valor de la nota 2");
        double nota2 = entrada.nextDouble();
        System.out.println("Ingrese valor de la nota 3");
        double nota3 = entrada.nextDouble();
        System.out.println("Ingrese valor de la nota 4");
        double nota4 = entrada.nextDouble();
        String promedio = obtenerPromedio(nota1, nota2, nota3, nota4);
        System.out.printf("El promedio de las notas %.0f %.0f %.0f %.0f es %s\n",
                nota1,nota2,nota3,nota4,promedio);

    }

    public static String obtenerPromedio(double n1, double n2, double n3, double n4) {
        String promedio="";
        double prom;
        prom = (n1 + n2 + n3 + n4) / 4;
        if (prom >= 0 && prom <= 5) {
            promedio = "Regular";
        }
        if (prom >= 5.1 && prom <= 8) {
            promedio = "Bueno";
        }
        if (prom >= 8.1 && prom <= 9) {
            promedio = "Muy Bueno";
        }
        if (prom >= 9.1 && prom <= 10) {
            promedio = "Sobresaliente";
        }
        return promedio;
    }
}
