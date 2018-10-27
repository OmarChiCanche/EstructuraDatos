/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.io.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class metodo {
     String[] lista;
     
     metodo(ArrayList < String > nom){
         this.lista = new String[nom.size()];
         lista = nom.toArray(lista);
     }
     
public boolean Buscar(String[] nom, String buscar, int i){
    if(i == nom.length){
        return false;
    }if(nom[i].equals(buscar)){
        return true;
        }else{
            return Buscar(nom, buscar, i+1);
            }
}

public void ordenación(String[] nom, int i, int j){
    if (j < nom.length && i!= j){
        if(nom[i].compareToIgnoreCase(nom[j]) < 0){
            String almacen = nom[i];
            nom[i] = nom[j];
            nom[j] = almacen;  
        } 
        ordenación(nom, i, j+1);
    }     
}

public String buscador(String buscar, int i){
    boolean item = Buscar(lista, buscar, i);
    if (item == true){
        return buscar+" si se encuentra en la lista";
    }else{ 
        return buscar+" no se encuentra en la lista";
        }
}

public void ordenar (String[] nom, int i){
    if( i <nom.length){
        ordenación(nom, i, 0);
        ordenar(nom, i+1);
    }     
}
}
