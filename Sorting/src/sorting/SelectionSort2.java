/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Ahmad Saifur Rohman
 */
public class SelectionSort2 {
    public static void main(String args[])  
   {  
       int index, i, j, temp;  
       int nilai[] = new int[25];  
       Scanner scan = new Scanner(System.in);  
         
       System.out.print("Masukan jumlah nilaiay: ");  
       index = scan.nextInt();  
         
       System.out.print("Masukan nilai yang akan di sorting: ");  
       for(i=0; i<index; i++)  
       {  
           nilai[i] = scan.nextInt();  
       }  
           
       for(i=0; i<index; i++)  
       {  
           for(j=i+1; j<index; j++)  
           {  
               if(nilai[i] > nilai[j])  
               {  
                   temp = nilai[i];  
                   nilai[i] = nilai[j];  
                   nilai[j] = temp;  
               }  
           }  
       }  
         
       System.out.print("Hasil sorting :\n");  
       for(i=0; i<index; i++)  
       {  
           System.out.print(nilai[i]+ "  ");  
       }  
       
       System.out.println(); 
   }  
}
