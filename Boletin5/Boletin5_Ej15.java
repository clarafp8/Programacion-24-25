/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej15;

import java.util.Scanner;

/**
    * Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla que
   debe rellenar de la siguiente forma: se leerá por teclado una serie de números, guardando
   en la tabla los pares hasta que esté llena, e ignorando los impares. La función tiene
   que devolver la cantidad de impares desechados.
 *
 * @author usuarioDAW
 */
public class Boletin5_Ej15 {

    /**
     * @param tabla
     * @return 
     */
    public static int rellenaPares(int tabla[]){
        int cont=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Rellene la tabla: ");
        for (int i = 0; i < tabla.length; i++) {
            int n=sc.nextInt();
            if(n%2==0){
                tabla[i]=n;
                
        }else{
                cont++;
                i--;
            }
            
        }
        System.out.println("\nLa tabla rellena es de la siguiente forma: ");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
            
        }
        
        return cont;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Seleccione el tamaño de la tabla: ");
        int tam=sc.nextInt();
        int tabla[]=new int[tam];
        System.out.println("La cantidad de impares rechazados es: "+ rellenaPares(tabla));
    }
    
}
