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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        int opcion = 0;
        int cedula;
        String decs;
        boolean bandera = true;

        while (bandera == true) {
            System.out.println("Ingrese su nombre y apellido");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula");
            cedula = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese 1 para calcular el valor de luz, de "
                    + "lo contrario ingrese 2 para calcular el Predio");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1) {
                calcularValorLuz(nombre, cedula);
            } else {
                if (opcion == 2) {
                    calcularPredio(nombre, cedula);
                } else {
                    System.out.println("Error");
                }
            }
            System.out.println("si desea salir escriba si de lo contrario"
                    + "escriba no");
            decs = entrada.nextLine();
            if ("si".equals(decs)) {
                bandera = false;
            }
        }

    }

    public static void calcularValorLuz(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorLuz;
        double valorkilomes;
        double numkilomes;
        System.out.println("Ingrese el numero de kilowatios del mes");
        numkilomes = entrada.nextDouble();
        System.out.println("Ingrese el valor de kilowatios del mes");
        valorkilomes = entrada.nextDouble();
        valorLuz = valorkilomes * numkilomes;
        System.out.printf("Cliente %s con numero de "
                + "cedula %d debe cancelar el valor"
                + "de %.2f\n", nombre, cedula, valorLuz);
    }

    public static void calcularPredio(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorInm;
        double valorPredio;
        System.out.println("Ingrese el valor del inmueble");
        valorInm = entrada.nextDouble();
        valorPredio = (valorInm * 2) / 100;
        System.out.printf("Cliente %s con numero de cedula %d debe cancelar el "
                + "valor de %.2f\n", nombre, cedula, valorPredio);
    }
}
