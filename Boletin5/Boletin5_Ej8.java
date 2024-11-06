/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *Implementar la función sinRepetidos() con el prototipo,
        int [] sinRepetidos ( int t [])
        que construye y devuelve una tabla del tamaño apropiado, con los elementos de t,
        donde se han eliminado los datos repetidos.
 * @author usuarioDAW
 */
public class Boletin5_Ej8 {
     /**
     * 
     * @param args the command line arguments
     */
    
    public static int[] sinRepetidos(int t []){
        
        int[] resultado= new int[1];
        resultado[0]=t[0];
        
        for(int i=1; i<t.length;i++){
            
            int valorActual=t[i];
            
            if(!existeEnTabla(resultado,valorActual)){
                
                resultado=insertar(resultado,valorActual);
            }   
        } 
        return resultado ;
    }
    
    public static int[] insertar(int[] tabla, int valor){
        
         int nueva[]=Arrays.copyOf(tabla, tabla.length+1);
        nueva[nueva.length-1]=valor;
        
        return nueva;
    }
    public static boolean existeEnTabla(int[] tabla,int valor){
          
           for(int i=0;i<tabla.length;i++){
               if(i==valor){
                   
                   return true;
               } 
           }
           return false; 
       }
    
    public static void main(String[] args) {
        
        int[] t={1,2,3,4,4,5,3,8};
        int[] resultado=sinRepetidos(t);
        for (int i : resultado) {
            System.out.print(i + " ");    
        }
    } 
}


