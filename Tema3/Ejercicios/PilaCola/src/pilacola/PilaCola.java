/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilacola;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Alexis Omar
 */
public class PilaCola {

    /**
     * @param args the command line arguments
     */
   // Stack<Character> pila = new Stack<Character>();
    public static void main(String[] args) {
       Datos p = new Datos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingresa los caracteres a pasar");
        String entrada = sc.nextLine();
        p.Almacenar(entrada);
        System.out.println("\n");
        
       
    }
    
}


