/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej6;


import java.util.Arrays;
import java.util.Scanner;

/**
 *Diseñar una aplicación para gestionar un campeonato de programación, donde se in-
troducen la puntuación (enteros) obtenidos por 5 programadores, conforme van ter-
minando su prueba. La aplicación debe mostrar las puntuaciones ordenadas de los 5
participantes. En ocasiones, cuando finalizan los 5 participantes anteriores, se suman
al campeonato un máximo de 3 programadores de exhibición, cuyos puntos se incluyen
con el resto. La forma de especificar que no intervienen más programadores de exhibi-
ción es introducir como puntuación un –1 La aplicación debe mostrar, finalmente, los
puntos ordenados de todos los participantes.
 * @author usuarioDAW
 */
public class Boletin5_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,n2,n3;
        int[] tabla= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
           System.out.println("Introduzca la puntuación del programador "+ i +":"); 
           n=sc.nextInt();
           tabla[i]=n;
           
        }
            
        Arrays.sort(tabla);
        for(int i=0;i<5;i++){
            System.out.print(tabla[i]+ ",");
        }
        
        System.out.println("\nHay algún concursante extra?: \n*=Si\n-1=No");
        n2=sc.nextInt();
        if(n2!=-1){
            
            do{
                System.out.println("Cuántos? (máximo 3): ");
                n3=sc.nextInt();
            if(n3>3){
              System.out.println("Error, no pueden haber más de 3 participantes");  
            }
                
            }while(n3>3);
            
            int nueva[]= Arrays.copyOf(tabla, tabla.length + n3);
            
            for (int o=5; o<nueva.length;o++){
            System.out.println("\nPuntuación concursantes extra:");
            n2=sc.nextInt();
            nueva[o]=n2; 
        }
            
            Arrays.sort(nueva);
            for(int i=0;i<nueva.length;i++){
            System.out.print(nueva[i]+ ",");
        }
                
        
        
            
        }
        
    }
    
}
