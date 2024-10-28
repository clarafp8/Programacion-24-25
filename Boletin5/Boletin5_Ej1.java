/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej1;

import java.util.Scanner;

/**
 *Diseñar un programa que solicite al usuario que introduzca por teclado 5 números
    decimales a continuación, debe mostrar los números en el mismo orden que se han
    introducido.
 * @author usuarioDAW
 */
public class Boletin5_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double tabla[]=new double[61];
        for(int i=1;i<tabla.length;i++){
            
           System.out.println("Introduzca un numero: ");
           double num=sc.nextDouble(); 
           tabla[i]=num;
           
           
        }
        for(int i=1;i<tabla.length;i++){
            
            System.out.println("La posicion "+i+" contiene el numero "+ tabla[i]);
        }
        
    }
    
}
