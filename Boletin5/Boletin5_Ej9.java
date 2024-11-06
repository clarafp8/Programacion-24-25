/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej9;

import java.util.Scanner;

/**
 *Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
    educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas
    (números enteros) del primer, segundo y tercer trimestre de un grupo. Debemos mostrar
    al final la nota media del grupo en cada trimestre, y la media del alumno que se
    encuentra en la posición pos (que se lee por teclado).
 * 
 */
public class Boletin5_Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tabla=new int[5];
        int n1 = 0,n2 = 0,n3 = 0,total=0;
        Scanner sc =new Scanner (System.in);
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca las notas del alumno "+ (i+1));
            System.out.println("introduzca la nota del primer trimestre:");
            n1=sc.nextInt();
            System.out.println("introduzca la nota del segundo trimestre:");
            n2=sc.nextInt();
            System.out.println("introduzca la nota del tercer trimestre:");
            n3=sc.nextInt();
            tabla[i]= (n1+n2+n3)/3;
             total+=(n1+n2+n3)/3;
        }
         System.out.println("La media del grupo entero es : "+(total/5) );
            System.out.println("Introduzca el numero del alumno del que quiere saber la media (del 1 al 5): ");
        int pos=sc.nextInt();
        System.out.println("La media del alumno "+pos +" es "+tabla[pos-1]);
        }
        
    }
    

