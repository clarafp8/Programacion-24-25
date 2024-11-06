/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej14;

/**
    *Definir una función que tome como parámetros dos tablas, la primera con los 6 números
   de una apuesta de la primitiva, y la segunda con los 6 números de la combinación
   ganadora. La función devolverá el número de aciertos.
 * @author usuarioDAW
 */
public class Boletin5_Ej14 {

    /**
     * @param tabla1
     * @param tabla2
     * @return 
     */
    public static int apuesta(int tabla1[], int tabla2[]){
        int cont=0;
     
        for (int i = 0; i < tabla1.length; i++) {
            if(tabla1[i]==tabla2[i]){
                cont++;
            }

        }
        return cont;
    }
    public static void main(String[] args) {
        int tabla[]={1,4,7,2,3,9};
        int tabla2[]={1,4,7,3,8,12};
        System.out.println("Se han acertado "+ apuesta(tabla,tabla2)+" de los 6 numeros");
    }
    
}
