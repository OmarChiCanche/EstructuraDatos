/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
/**
 *
 * @author
 * Omar Alexis Chi Canche
 * Sistemas 3B TEC Valladolid
 */
class Palabra
{
     public static boolean palindromo(String pal)
    {   // if el tamaño de la cadena es 0 o 1 entonces es palindromo
        if(pal.length() == 0 || pal.length() == 1)
            return true; 
        
        if(pal.charAt(0) == pal.charAt(pal.length()-1))
            /*
            De no ser asi compara caracter por y caracter y devuelve un valor de carácter igual al carácter situado en la posición especificada por index. 
            El primer carácter de una cadena está en el índice 0, el segundo en el índice 1 y así sucesivamente.
            */
        return palindromo(pal.substring(1, pal.length()-1));// devuelve la palabra que contiene la subcadena desde 1 hasta el tamaño de la palbra -1.
        
        return false;
    
    }
}
