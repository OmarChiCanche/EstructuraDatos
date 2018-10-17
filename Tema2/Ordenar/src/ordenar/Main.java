/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

/**
 *
 * @author Alexis Omar
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
            File archivo=null;
            FileReader fr=null;
            BufferedReader br=null;
            try {
            archivo = new File ("texto.txt");//archivo = new File(System.getProperties().getProperty("user.dir")+"//

            fr = new FileReader (archivo);

            br = new BufferedReader(fr);

            String linea;
            String delimiter = "\n" ;
            String matriz[][]= new String[10][1];
            int h=0;
            String a[]=new String[6];
            while((linea=br.readLine())!=null) 
            {
                a=linea.split(delimiter);
                for(int j=0;j<a.length;j++)
                    {
                        matriz[h][j]=a[j];
                    }
                 h++;
            }

            System.out.print ("Lista De Nombres\n\n");
            for (int j= 0; j <matriz.length; j++) 
            {

                for(int o= 0; o <matriz[0].length; o++) 
                {

                System.out.print(matriz[j][o] + " ");

                }
                System.out.println();
            }
                }
            catch(IOException e)
                {

                 System.out.println(e);
                }
    }
}