package javaapplication3;
import java.util.Scanner;
import static javaapplication3.Palabra.palindromo;
import javax.swing.JOptionPane;
/**
 *
 * @author 
 * Omar Alexis Chi Canche
 * Sistemas 3B TEC Valladolid
 */
public class JavaApplication3 { 


   public static void main(String[] args) {
      //JOptionPane.showMessageDialog ( null,"Hola,Bienvenido(a) al programa.\nEs palindromo o no?\n");
       String palabra, reemplazo;
      // palabra = JOptionPane.showInputDialog( "Introduzca la palabra" );
       
       System.out.print("Hola,Bienvenido(a) al programa.\n");
       System.out.print("Es palindromo o no?\n");
       Scanner sc=new Scanner (System.in);
      //String palabra, reemplazo;
       System.out.print("Ingrese la palabra a determinar:\t");
       
      palabra= sc.nextLine();
       
      reemplazo = palabra.replaceAll (" ",""); // reemplaza todas las apariciones de " " por ""
       
       System.out.print("La Palabra "+ palabra+": ");
       if(palindromo(reemplazo))
           // JOptionPane.showMessageDialog (null, "La Palabra "+ palabra +" : Es Palindromo" );
         System.out.println("Es Palindromo");
        else
        //JOptionPane.showMessageDialog (null,"La Palabra "+ palabra +" : Es Palindromo" );
         System.out.println("No es Palindromo");
   }
}
