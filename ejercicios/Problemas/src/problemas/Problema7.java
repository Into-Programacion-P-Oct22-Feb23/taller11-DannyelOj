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
public class Problema7 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String[] lista = obtenerCiudad();
        System.out.println("El arreglo es: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("[%s]", lista[i]);

        }
        System.out.println("\nSolo debe tener valores de 4 o 5 caracteres");
        obtenerCaracteres(lista);
    }

    public static String[] obtenerCiudad() {
        int numero;
        System.out.println("Ingrese el numero de valores de su lista:");
        numero = entrada.nextInt();
        entrada.nextLine();
        String[] cadena = new String[numero];
        for (int i = 0; i < cadena.length; i++) {
            System.out.println("Ingrese ciudades del Ecuador: ");
            String ciudad = entrada.nextLine();
            cadena[i] = ciudad;
        }
        String mensajeFinal = "";
        for (int i = 0; i < cadena.length; i++) {
            mensajeFinal = String.format("%s%s\n",
                    mensajeFinal, cadena[i]);
        }
        return cadena;
    }

    public static void obtenerCaracteres(String[] a) {
        for (int i = 0; i < a.length; i++) {
            int caracteres = a[i].length();
            if (caracteres == 4 || caracteres == 5) {
                System.out.printf("%s\n", a[i]);
            }

        }
    }
}
