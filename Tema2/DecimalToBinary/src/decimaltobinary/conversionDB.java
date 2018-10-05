/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltobinary;

/**
 *
 * @author
 * Omar Alexis Chi Canche
 * Sistemas 3B TEC Valladolid
 */
public class conversionDB {
    public static void convertir(int numero) {
    if (numero>0) {
        convertir(numero/2);
        System.out.print(numero%2 + " ");
    }
}
}
