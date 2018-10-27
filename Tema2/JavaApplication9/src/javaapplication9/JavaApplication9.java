/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.*;
import java.io.*;
/**
 *
 * @author Admin
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        Scanner x = new Scanner(System.in);
        ArrayList < String > palabras = new ArrayList();
       
         try ( FileReader fr =  new  FileReader ("Texto.txt")) {
             BufferedReader br =  new  BufferedReader (fr);
             String linea;
             
             while ((linea = br.readLine()) !=  null )
             {
                 palabras.add(linea);
             }
             fr.close();        
         }catch( IOException e) {
      System.out.println ( " El archivo no existe " +e.getMessage());
    }

     metodo a = new metodo(palabras);
        
        do{
            System.out.println("1.buscar nombre\n2. ordenar lista");
            op=x.nextInt();
            System.out.println("\n");
            
            if(op==1){
                String buscar;
                System.out.println("Cual es el nombre a encontrar");
                buscar =x.next();
                System.out.println(a.buscador(buscar,0));
            }else
                if(op==2){
                    String nom[] = new String[palabras.size()];
                    nom = palabras.toArray(nom);
                    a.ordenar(nom,0);
                    for(String ver : nom){
                     System.out.println(ver);    
                    }
                }
        }while(op<2);
    }
    
}
