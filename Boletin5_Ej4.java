/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Implementar un programa que inicialice una tabla con nuestros números favoritos. A
    continuación, pedir al usuario el índice de un elemento que será eliminado de la tabla.
    Continuaremos eliminando elementos hasta que el índice introducido sea negativo o
    hasta que no existan más elementos que borrar. Es imprescindible controlar que el
    índice leído corresponde a un dato válido.
 * 
 * @author usuarioDAW
 */
public class Boletin5_Ej4 {

    /**
     */
    public static int[] borrarElemento(int tabla3[],int pos, int tamaño){
        
        tabla3[pos]=tamaño;
        
        int[] nuevo= Arrays.copyOf(tabla3,tamaño);
        for (int i = 0; i < nuevo.length-1; i++) {
            
            System.out.print(nuevo[i]);
       }
        
        return  nuevo;
        
    }
    
    public static void main(String[] args) {
        
       int tabla3[]={1,2,3,4,5,6,7,8};
       int pos=0, tamaño = tabla3.length;
       
       Scanner sc= new Scanner(System.in);
       
       for (int i = 0; i < tabla3.length; i++) {
            System.out.print(tabla3[i] +",");
       }

       
       
       
        do {
            
            System.out.println(". Introduzca el índice del número que se desea eliminar (de 0 a 7) : ");
            pos=sc.nextInt();
            pos=pos-1;
            if(pos<=tabla3.length){
                tamaño--;
                borrarElemento(tabla3,pos, tamaño);
                        
            }
            else{
                    System.out.println("Error.");
                    }
            
                              
        } while(pos>=0 && tamaño>1);
        
                
                    
    

    }
}

