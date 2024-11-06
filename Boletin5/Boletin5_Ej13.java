/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej13;

/**
 *Sobrecargar la función maximo() (ejercicios resueltos 4.4 y 4.5) utilizando una versión
    que calcule el máximo de una tabla de enteros.
 * @author usuarioDAW
 */
public class Boletin5_Ej13 {

    /**
     * @param tabla
     * @return 
     */
    public static int maximo (int tabla[]){
       int max=Integer.MIN_VALUE;
        for (int i = 0; i < tabla.length; i++) {
            if(tabla[i]>max){
                max=tabla[i];
            } 
        }
    return max;
}
    public static void main(String[] args) {
      int tabla[]={1,3,4,2,6,9,8,4,3} ;
        System.out.println("El número más grande de la tabla es: "+ maximo(tabla));
    } 
    
}
