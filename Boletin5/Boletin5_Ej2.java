/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej2;


import java.util.Scanner;

/**
 *Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
    continuación, se introducirá por teclado esa cantidad de números enteros, y por último,
    los mostrará en el orden inverso al introducido.
 * @author usuarioDAW
 */
public class Boletin5_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Setelccione el tamaño de la tabla: ");
        int tam=sc.nextInt();
        int tabla1[]=new int[tam];
        
        for(int i=0;i<tam;i++){
            System.out.println("Introduzca los numeros: ");
            int num=sc.nextInt();
            tabla1[i]=num;
        }
        for(int i=tabla1.length;0<i ;i--){
            System.out.println("La posicion "+i+" contiene el numero "+ tabla1[i-1]);
        }
        
        
    }
    
}
