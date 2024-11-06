/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej12;

/**
    *Crear una tabla bidimensional de tamaño 5 × 5 y rellenarla de la siguiente forma: la
   posición [n, m] debe contener n + m. Después se debe mostrar su contenido.
 * @author usuarioDAW
 */
public class Boletin5_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int matriz[][]= new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j]=i+j;
             System.out.println(matriz[i][j]);   
            }
            
        }
        
    }
    
}
