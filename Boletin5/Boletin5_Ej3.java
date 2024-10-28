/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej3;

import java.util.Scanner;

/**
 *Introducir por teclado un número n; a continuación solicitar al usuario que teclee n
    números. Realizar la media de los números positivos, la media de los negativos y contar
    el número de ceros introducidos.
    * 
 * @author usuarioDAW
 */
public class Boletin5_Ej3 {

    /**
     * @param tabla2
     * @return 
     */
    
    public static double mediaPositivos(int[] tabla2){
        
        double acum=0;
        double cont=0;
        
        for(int i=0;i<tabla2.length;i++){
            if(tabla2[i]>0){
                acum+=tabla2[i];
                cont++;
            }
        }
        double cocientePos=acum/cont;
            return cocientePos ;  
        }
    
    public static double mediaNegativos(int[] tabla2){
        double acum=0;
        double cont=0;
        for(int i=0;i<tabla2.length;i++){
            if(tabla2[i]<0){
                acum+=tabla2[i];
                cont++;
            }
        }
        double cocienteNeg=acum/cont;
         return cocienteNeg ;  
        }
    
        public static int cuentaCeros(int[] tabla2){
            
          int cont=0;
          for(int i=0;i<tabla2.length;i++){
              if(tabla2[i]==0){
                  cont++;
              }
          }
          return cont;
        }
    
    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
        
        System.out.println("Setelccione el tamaño de la tabla: ");
        int tam=sc.nextInt();
        int tabla2[]=new int[tam];
        
        for(int i=0;i<tam;i++){
            System.out.println("Introduzca los numeros: ");
            int num=sc.nextInt();
            tabla2[i]=num;
            
           
        }
        System.out.println("La media de los numeros positivos de la tabla es: "+mediaPositivos(tabla2));
        System.out.println("La media de los numeros negativos de la tabla es: "+mediaNegativos(tabla2));
        System.out.println("La cuenta de los 0 introducidos en la tabla es: "+cuentaCeros(tabla2));
        
        
    }
    
}
