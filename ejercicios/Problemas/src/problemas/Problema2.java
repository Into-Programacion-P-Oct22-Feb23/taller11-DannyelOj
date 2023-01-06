/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author UTPL
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        System.out.println("Ingrese 1 para obtenre el area de un cuadrado, 2"
                + "para obtener el area del triangulo y 3 para obtener el area"
                + "del rectangulo");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Error: no existe opcion");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double lado;
        double areaC;
        System.out.println("Ingrese el valor de lado");
        lado = entrada.nextDouble();
        areaC = lado * 4;
        System.out.printf("El area del cuadrado es: %.2f\n", areaC);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double areaT;
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        areaT = (base * altura) / 2;
        System.out.printf("El area del triangulo es: %.2f\n", areaT);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double areaR;
        System.out.println("Ingrese la base del Rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del Rectangulo");
        altura = entrada.nextDouble();
        areaR = base * altura;
        System.out.printf("El area del Rectangulo es:%.2f\n", areaR);
    }
}
