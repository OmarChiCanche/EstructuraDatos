/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilainversa;

import java.util.Scanner;

/**
 *
 * @author Omar Alexis Chi Canche
 * Sistemas Computacionales 3B 2018
 *17070004
 * Ejercicio1 Tema 3 Pila: Ingresa caraccteres y los invierte
 */
public class PilaInversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Palabra p = new Palabra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingresa los caracteres a invertir");
        String entrada = sc.nextLine();
        p.Invertir(entrada);
        System.out.println("\n");
        
       
    }
    
}
