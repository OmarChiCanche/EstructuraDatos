/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiodinero;

import cambio.conversionCambio;
import java.util.Scanner;

/**
 * 
 * Omar Alexis Chi Canche
 * Sistemas 3B 17070004
*/
public class Cambiodinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
     conversionCambio r = new conversionCambio();
        // variable que contendra el valor a devolver
        
        int cambio=0;
        int valor;
        int pagar;
        do{
            try{
                System.out.print("Cuanto fue el valor?");
                valor=sc.nextInt();
                System.out.print("Con cuanto vas pagar?");
                pagar=sc.nextInt();
                cambio=pagar-valor;
                System.out.print("Tu cambio es de: \t" + cambio +"\n");
            }catch(Exception e){
                System.out.println("Introduciste un dato erroneo.");
                System.out.println("");
                sc.nextLine();
            }
        }
        while(cambio<=0);
  
          
     r.calcular(cambio);
        
    }

}