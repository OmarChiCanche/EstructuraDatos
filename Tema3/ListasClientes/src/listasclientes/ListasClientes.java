/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasclientes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexis Omar
 */
public class ListasClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<String> listan = new ArrayList();
     ArrayList<String> listat = new ArrayList();
     Scanner sc = new Scanner (System.in);
     String nom=null;
     String tel=null;
     int n;
        System.out.println("Cuantos Clientes desea ingresar?");
        n = sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
        System.out.println("Ingresa el nombre del cliente");
        nom = sc.nextLine();
        listan.add(nom);
        
        System.out.println("Ingresa el telefono del cliente");
        tel = sc.nextLine();
        listat.add(tel);
        }
        for(int i=0;i<listan.size();i++)
        {
            System.out.print(listan.get(i));
        }
        for(int i=0;i<listan.size();i++)
        {
            System.out.println(listat.get(i));
        }
    }
}
