/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

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
        int n1;
        int n2;
        int n3;
        int n4;
        System.out.println("Ingrese primera nota");
        n1 = entrada.nextInt();
        System.out.println("Ingrese segunda nota");
        n2 = entrada.nextInt();
        System.out.println("Ingrese tercera nota");
        n3 = entrada.nextInt();
        System.out.println("Ingrese cuarta nota");
        n4 = entrada.nextInt();
        String resultado;
        resultado = obtenerPromedioCualitativo(n1, n2, n3, n4);
        System.out.printf("El promedio de las notas: "
                + "%d,%d,%d,%d es: %s", n1, n2, n3, n4, resultado);
    }

    public static String obtenerPromedioCualitativo(int n1, int n2, int n3, int n4) {
        int promedio;
        promedio = (n1 + n2 + n3 + n4) / 4;
        if (promedio > 0 && promedio <= 5) {
            return "Regular";
        } else {
            if (promedio > 5.1 && promedio <= 8) {
                return "Bueno";
            } else {
                if (promedio > 8.1 && promedio <= 9) {
                    return "Muy bueno";
                } else {
                    return "Sobresaliente";
                }
            }
        }
    }
}
