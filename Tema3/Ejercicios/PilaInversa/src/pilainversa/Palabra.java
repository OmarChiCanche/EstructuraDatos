/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilainversa;

import java.util.Stack;

/**
 *
 * @author Alexis Omar
 */

public class Palabra {
    
private final Stack<Character> pila = new Stack<Character>();
 
public void Invertir(String cadena)
{
    
    char carac[] = cadena.toCharArray();

    for (int i=0; i<carac.length; i++)
    {
        pila.push(carac[i]);
        
       // System.out.println(carac[i]);
    }
    System.out.println("Los caracteres invertidos son:");
    while (!pila.empty())
    {
        System.out.print(pila.pop());   
    }
    
}
}
