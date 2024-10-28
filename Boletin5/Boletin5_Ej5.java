/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej5;

import java.util.Random;
import java.util.Scanner;

/**
    *Desarrollar el juego la cámara secreta, que consiste abrir una cámara mediante su
   combinación secreta, que está formado por una combinación de dígitos del uno al cinco.
   El jugador especificará cuál es la longitud de la combinación, a mayor longitud mayor
   será la dificultad del juego. La aplicación genera, de forma aleatoria, una combinación
   secreta que el usuario tendrá que acertar. En cada intento se muestra como pista, para
   cada dígito de la combinación introducido por el jugador, si es mayor, menor o igual
   que el correspondiente en la combinación secreta.
 * @author usuarioDAW
 */
public class Boletin5_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        int n;
        
        System.out.println("Setelccione la longitud de la combinación a descifrar: ");
        int tam=sc.nextInt();
        int tablaSecreta[]=new int[tam];
        
        for(int i=0;i<tam;i++){
            
            tablaSecreta[i]=r.nextInt(5)+1;
            //System.out.print(tablaSecreta[i]+" , ");
           
                }
        
         for(int i=0;i<tam;i++){
       do{
        System.out.println("Introduzca un numero: ");
         n=sc.nextInt();
         
         if(n==tablaSecreta[i]){
             if(i== tam-1){
                 System.out.println("Enhorabuena, adivinaste el código secreto.");
             }else{
                System.out.println("El número es correcto. Siguiente dígito"); 
             }
             
         }else if(n<tablaSecreta[i]){
             System.out.println("El número es mayor. Intentalo de nuevo.");
            }else{
             System.out.println("El número es menor.Intentalo de nuevo.");
         }
             
         
       }while(n!=tablaSecreta[i]);
        
        }
    }
}
