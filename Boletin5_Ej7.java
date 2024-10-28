/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
    * Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar
   y mostrar. Leer otra serie de 6 enteros, que también se guardarán en una tabla y se
   mostrarán ordenados. A continuación, fusionar las dos tablas en una tercera, de forma
   que los 12 números sigan ordenados. Fusionar dos tablas ordenadas significa copiar en
   el orden correcto para que los datos resultantes continúen ordenados, sin necesidad de
   volver a realizar una ordenación.
 * @author usuarioDAW
 */
public class Boletin5_Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, p=0, n2;
       int[] tabla1= new int[6];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<6;i++){
           System.out.println("Introduzca los 6 números:"); 
           n=sc.nextInt();
           tabla1[i]=n;
           
        }
        
       Arrays.sort(tabla1);
       for(int i=0;i<6;i++){
           System.out.println(tabla1[i]);
       }
       
       int[] tabla2= new int[6];
        for(int i=0;i<6;i++){
           System.out.println("Introduzca los 6 números:"); 
           n=sc.nextInt();
           tabla2[i]=n;
           
        }
        Arrays.sort(tabla2);
       for(int i=0;i<6;i++){
           System.out.println(tabla2[i]);
       }
       
       int nueva[]=Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
       for (int i=6;i<nueva.length;i++){
           
           nueva[i]=tabla2[p];
           p++;
       }
       //Arrays.sort(nueva);
        System.out.println("\n\n\nLa tabla nueva fusionada es: ");
        for (int i = 0; i < nueva.length; i++) {
            System.out.println(nueva[i]);
        }
    }
    
}
