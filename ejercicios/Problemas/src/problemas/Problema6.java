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
public class Problema6 {

    public static void main(String[] args) {
        // TODO code application logic here

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        System.out.printf("La Media es: %d\n",
                obtenerMediaAritmetica(informacion));
        System.out.printf("La Desviacion Estandar es: %d\n",
                obtenerDesviacionEstandar(informacion));
    }

    public static int obtenerMediaAritmetica(int informacion[]) {
        int suma = 0;
        int numdatos = 9;
        int media;
        for (int i = 0; i < informacion.length; i++) {
            suma = suma + informacion[i];

        }
        media = suma / numdatos;
        return media;

    }

    public static int obtenerDesviacionEstandar(int informacion[]) {
        int sumatoria;
        int varianza = 0;
        int desviacion;
        int med = obtenerMediaAritmetica(informacion);
        int numdatos = 9;

        for (int i = 0; i < informacion.length; i++) {
            sumatoria = (int) Math.pow(informacion[i] - med, 2);
            varianza = varianza + sumatoria;
        }
        varianza = varianza / (numdatos);
        desviacion = (int) Math.sqrt(varianza);
        int redondeo = (int) (Math.rint(desviacion * 100) / 100);
        return redondeo;
    }

}
