/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilacola;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Alexis Omar
 */
class Datos {
    
   private final Stack<Character> pila = new Stack<Character>();
   private final LinkedList<Character> cola = new LinkedList<Character>();
public void Almacenar(String cadena)
{
    
    char carac[] = cadena.toCharArray();
   // System.out.println("Los Caracteres en la Pila son:");
    for (int i=0; i<carac.length; i++)
    {
        pila.push(carac[i]);
        cola.push(carac[i]);
    }
     System.out.println("Los caracteres en la Pila son:");
    while (!pila.empty())
    {
        System.out.println(pila.pop());   
    }
    
    System.out.println("Los caracteres en la cola son:");
    while (!cola.isEmpty())
    {
        System.out.print(cola.pop());   
    }
    
}
}