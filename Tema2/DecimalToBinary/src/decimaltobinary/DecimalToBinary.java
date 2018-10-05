/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltobinary;

import static decimaltobinary.conversionDB.convertir;
import java.util.Scanner;

/**
 *
 * @author
 * Omar Alexis Chi Canche
 * Sistemas 3B TEC Valladolid
 */
public class DecimalToBinary {
        // TODO code application logic here
    public static void main(String[] args) {

    System.out.print("Hola,Bienvenido(a) al programa.\nPara convertir decimales a binarios\n");
    Scanner sc=new Scanner (System.in);
    int decimal;//Declaramos el numero a leer
    do{
    System.out.print("\nIngrese el numero a convertir:\t");
    decimal= sc.nextInt();//Leemos el numero
    System.out.print("\nEl numero "+decimal+" a Binario es:\t");
    convertir(decimal);//le envio el numero decimal al metodo convertir realiza el proceso 
    //y decuelve un valor qe se anexa a la linea de codigo de impresion
    }
    while (decimal>0);//termina la condicion del bucle
    System.out.print("Deben ser mayores a cero");//imprime el mensaje
    

}
    }
