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
        System.out.println(promedio);

    }

    public static String obtenerPromedio(double n1, double n2, double n3, double n4) {
        String promedio;
        double prom;
        prom = (n1 + n2 + n3 + n4) / 4;
        if (prom >= 0 && prom <= 5) {
            promedio = "El promedio de las notas es Regular";
        }
        if (prom >= 5.1 && prom <= 8) {
            promedio = "El promedio de las notas es Bueno";
        }
        if (prom >= 8.1 && prom <= 9) {
            promedio = "El promedio de las notas es Muy Bueno";
        }
        if (prom >= 9.1 && prom <= 10) {
            promedio = "El promedio de las notas es Sobresaliente";
        }
        return promedio;
    }
