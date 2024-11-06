/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej11;

import java.util.Scanner;

/**
    *Escribir un programa que solicite los elementos de una matriz de tamaño 4 × 4. La
   aplicación debe decidir si la matriz introducida corresponde a una matriz mágica, que
   es aquella donde la suma de lo elementos de cualquier fila o de cualquier columna vale
   lo mismo.
    * @author usuarioDAW
 */
public class Boletin5_Ej11 {

    /**
     * @param matriz
     * @param fila
     * @return 
     */
    
    public static int sumaFila(int matriz[][],int fila){
        
        int suma=0;
        for(int i = 0; i < matriz.length; i++) {
                suma+=matriz[fila][i];
            }
            
        return suma;
    }
    public static int sumaColumna(int matriz[][],int columna){
        int suma2=0;

            for(int i = 0; i < matriz.length; i++) {
                suma2+=matriz[i][columna];
            }
         
         return suma2;
    }
    
    public static void main(String[] args) {
        int[][] matriz=new int[4][4];
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca los elementos de la matriz (16 numeros): ");
        for(int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col]=sc.nextInt();   
            }
            
        }
        
        int suma=sumaFila(matriz,0);
        boolean es_magica=true;
        
        for (int fila = 0; fila < matriz.length; fila++) {
            if(sumaFila(matriz,fila)!=suma){
                es_magica=false;
            }
        }
         for (int col = 0; col < matriz.length; col++) {
            if(sumaColumna(matriz,col)!=suma){
                es_magica=false;
            }

        }
         if(es_magica==true){
             System.out.println("La matriz es mágica");
         }else{
             System.out.println("La matriz no es mágica");
         }
    }
}
       
    

