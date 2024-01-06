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
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirSuma(informacion);
    }

    public static void imprimirSuma(int[][] suma) {
        int suma1 = 0;
        int suma2;
        for (int f = 0; f < suma.length; f++) {
            for (int c = 0; c < suma[f].length; c++) {
                suma2 = suma[f][c];
                suma1 = suma1 + suma2;
            }
        }
        System.out.printf("Suma total del arreglo es: %d \n", suma1);
    }
}
