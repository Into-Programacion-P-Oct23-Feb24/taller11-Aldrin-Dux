/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

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
        double nota1 = 10;
        double nota2 = 5;
        double nota3 = 8;
        double nota4 = 7;
        obtenerPromedio(nota1, nota2, nota3, nota4);

    }

    public static void obtenerPromedio(double n1, double n2, double n3, double n4) {
        String cadena = "";
        double prom;
        prom = (n1 + n2 + n3 + n4) / 4;
        if (prom >= 0 && prom <= 5) {
            cadena = String.format("%sEl promedio de las notas es Regular",
                    cadena);
            System.out.printf("%s", cadena);
        } else {
            if (prom >= 5.1 && prom <= 8) {
                cadena = String.format("%sEl promedio de las notas es Regular",
                        cadena);
                System.out.printf("%s", cadena);
            } else {
                if (prom >= 8.1 && prom <= 9) {
                    cadena = String.format("%sEl promedio de las notas es Regular",
                            cadena);
                    System.out.printf("%s", cadena);
                } else {
                    if (prom >= 9.1 && prom <= 10) {
                        cadena = String.format("%sEl promedio de las notas es Regular",
                                cadena);
                        System.out.printf("%s", cadena);
                    }
                }
            }
        }
    }
