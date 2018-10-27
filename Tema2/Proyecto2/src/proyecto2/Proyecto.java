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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Proyecto {

    public static void main(String[] args) {
        String texto1="";
        try
    {
        FileReader lector=new FileReader("texto.txt");
        BufferedReader contenido=new BufferedReader(lector);
        System.out.println("Lista\n");
        while((texto1=contenido.readLine())!=null)
        {
        System.out.println(texto1);
        }
        }
    catch(IOException e)
        {
        System.out.println("Error al leer");
        }

        ///////////////////////////////
        Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);
        String texto;
        //Para seleccionar el archivo
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(j);
        
      
        System.out.print("Introduce texto a buscar: ");
        texto = sc.nextLine();
        
        
        
        try {
            //Guardamos el path a la variable ruta declarada con sring
            String ruta = j.getSelectedFile().getAbsolutePath();
            //se crea un FIle Aosciado al archivo
            File f = new File(ruta);
            //creamos un Scanner que leera el archivo
            entrada = new Scanner(f);
                    
            //mostramos el nombre del fichero
            //System.out.println("Archivo: " + f.getName());
            //mostramos el texto a buscar
            System.out.println("Usted Busco: " + texto);
            while (entrada.hasNext()) { //mientras no se llegue al final del archivo
                linea = entrada.nextLine();  //se lee una línea cada vuelta
                if (linea.contains(texto)) {   //si la línea contiene el texto buscado se muestra por pantalla
                    System.out.println(linea + " Se encuentra en la linea:" + numeroDeLinea);
                    contiene = true;
                }
                numeroDeLinea++; //se incrementa el contador de líneas
            }
         
            if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo

                System.out.println(texto + " El archivo no se ha encontrado");
            }
        } catch (FileNotFoundException e) {//utilizamos ste catch par amaatrapar la excepcion
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No se ha seleccionado el archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }
}//Fin programa de búsqueda de texto en un archiv



    /*String texto=""; 

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
        }*/
