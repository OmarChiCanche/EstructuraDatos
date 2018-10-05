/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
/**
 *
 * @author Alexis Omar
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
    String texto=""; 

    try
    {
        FileReader lector=new FileReader("texto.txt");
        BufferedReader contenido=new BufferedReader(lector);
        System.out.println("Lista\n");
        while((texto=contenido.readLine())!=null)
        {
        System.out.println(texto);
        }
        }
    catch(IOException e)
        {
        System.out.println("Error al leer");
        }
    
}
}