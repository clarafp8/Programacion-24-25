/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_ej7.pkg2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuarioDAW
 */
public class Boletin5_Ej72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n;
         int i1=0,i2=0,i3=0;
       int[] t1= new int[6];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<6;i++){
           System.out.println("Introduzca los 6 números:"); 
           n=sc.nextInt();
           t1[i]=n;
           
        }
        
       Arrays.sort(t1);
       for(int i=0;i<6;i++){
           System.out.println("La tabla uno es:"+t1[i]);
       }
       
       int[] t2= new int[6];
        for(int i=0;i<6;i++){
           System.out.println("Introduzca los 6 números:"); 
           n=sc.nextInt();
           t2[i]=n;
           
        }
        Arrays.sort(t2);
       for(int i=0;i<6;i++){
           System.out.println("La tabla dos es:" + t2[i]);
       }
       
       int[] t3= new int[t1.length+t2.length];
       
       while(i3<t3.length){
           if(i1<t1.length && i2<t2.length){
               
             if( t1[i1]<t2[i2]||i2<t2.length){
               t3[i3]=t1[i1];
               i1++;
               i3=i3+1;
           } else {
               t3[i3]=t2[i2];
               i2++;
               i3=i3+1;
               
           }
           }
               
           for (int i = 0; i < t3.length; i++) {
               System.out.println(t3[i]);
           }
       }
//       for(int i=0;i<t3.length;i++){
//           System.out.println(t3[i]);
//       }
        
    }
    
}
