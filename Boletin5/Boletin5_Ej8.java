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

//public class ElementosUnicos {
//
//    public static void main(String[] args) {
//        int[] t = {1, 2, 3, 2, 4, 3, 5};
//        int[] resultado = obtenerElementosUnicos(t);
//        
//        // Imprimir los elementos únicos
//        for (int num : resultado) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static int[] obtenerElementosUnicos(int[] t) {
//        // Comprobar que el array no esté vacío
//        if (t.length == 0) return new int[0];
//
//        // Inicializar la tabla de resultados con el primer elemento de t
//        int[] resultado = new int[1];
//        resultado[0] = t[0];
//
//        // Bucle desde la segunda posición hasta la última de t
//        for (int i = 1; i < t.length; i++) {
//            int valorActual = t[i];
//
//            // Comprobar si el valor ya existe en resultado
//            if (!existeEnTabla(resultado, valorActual)) {
//                // Si no existe, insertarlo
//                resultado = insertar(resultado, valorActual);
//            }
//        }
//
//        return resultado;
//    }
//
//    // Función para comprobar si un valor existe en la tabla
//    public static boolean existeEnTabla(int[] tabla, int valor) {
//        for (int num : tabla) {
//            if (num == valor) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // Función para insertar un nuevo valor en la tabla
//    public static int[] insertar(int[] tabla, int valor) {
//        // Crear una nueva tabla con un elemento más
//        int[] nuevaTabla = new int[tabla.length + 1];
//
//        // Copiar los elementos existentes a la nueva tabla
//        System.arraycopy(tabla, 0, nuevaTabla, 0, tabla.length);
//
//        // Insertar el nuevo valor en la última posición
//        nuevaTabla[nuevaTabla.length - 1] = valor;
//
//        return nuevaTabla;
//    }
//}
