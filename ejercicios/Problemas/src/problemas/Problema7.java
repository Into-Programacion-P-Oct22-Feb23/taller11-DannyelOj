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
public class Problema7 {
    
    public static void main(String[] args) {
        // 
        int numeroDatos = 3;
        int[] informacion = obtenerDatos(numeroDatos);
        for (int i = 0; i < informacion.length; i++) {
            System.out.printf("Datos ingresado: %d\n", informacion[i]);
        }
    }
}
