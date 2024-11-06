/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej10;

import java.util.Scanner;

/**
 *Leer y almacenar n números enteros en una tabla, a partir de la que se construiran otras
    dos tablas con los elementos con valores pares e impares de la primera, respectivamente.
 * @author usuarioDAW
 */
public class Boletin5_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cont1=0,cont2=0,pares=0,impares=0;
        System.out.println("Elija el tamaño de la tabla: ");
        int n=sc.nextInt();
        int t1[]=new int[n];
        for (int i = 0; i < t1.length; i++) {
            System.out.println("Rellena la tabla con números enteros: ");
            t1[i]=sc.nextInt();
        }
        
        for (int i = 0; i < t1.length; i++) {
            if(t1[i]%2==0){
                cont1++;
            }else{
                cont2++;
            }  
        }
        int tPares[]=new int[cont1];
        int tImpares[]=new int[cont2];
        
        for (int i = 0; i < t1.length; i++) {
            if(t1[i]%2==0){
                tPares[pares]=t1[i];
                pares++;
            }else{
                tImpares[impares]=t1[i];
                impares++;
            }
            
        }
        System.out.println("La tabla rellena es: ");
        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i]+ " ");
            
        }
        System.out.println("\nTabla pares: ");
        for (int i = 0; i < tPares.length; i++) {
          System.out.print( tPares[i]+ " ");  
        }
        System.out.println("\nTabla impares: ");
        for (int i = 0; i < tPares.length; i++) {
            System.out.print(tImpares[i]+ " ");

        }
        
        
    }
    
}
