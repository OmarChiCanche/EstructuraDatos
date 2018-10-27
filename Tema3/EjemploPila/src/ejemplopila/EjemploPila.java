/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopila;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Omar
 */
public class EjemploPila {

    /**como programar en java de deitel y deitel cap 3 y 4;
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila p = new Pila();
        /*
        Scanner sc= new Scanner (System.in);
        System.out.println("cuantos datos desea ingresar");
        int n= sc.nextInt();
        p.push(n);*/
        p.push(2);
        p.push(69);
        p.push(25);
        p.push(89);
        p.push(5);
        p.push(7);
      //  JOptionPane.showMessageDialog(null,);
        
        
    }
    
}
class Pila
{
    int arreglo[];
    int n, tope;
    public Pila(int tamanio)
    {
        n=tamanio;
        arreglo = new int[n];
        tope=-1;//La pila esta vacia
    }
    public void push(int valor)
    {
        if (tope==n-1) JOptionPane.showMessageDialog(null,"Pila Llena");
        tope ++;
        arreglo[tope]=valor;
    }
    public int pop()
    {
        int aux=985121;
        if 
        (tope==n-1) JOptionPane.showMessageDialog(null,"Pila Vacia");
        else
        {
        aux= arreglo[tope];//Ontenemos el valor de la cima
        arreglo[tope]=0;//eliminamos el valor de a pila
        tope--;//actualizamos el tope
        }
        return aux;
    }
    public String ToString()
    {
        String datos="";
        for (int i=n-1; i>=0;i--)
        {
            datos = datos+ arreglo[i]+"\n";
        }
        return datos;
    }    
}//fin de la clase de pila