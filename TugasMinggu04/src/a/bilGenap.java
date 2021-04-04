/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.Scanner;

/**
 *
 * @author Dahlah
 */
public class bilGenap {
    public static void main(String[] args) {
        System.out.print("Bilangan genap dari: ");
        int min=new Scanner(System.in).nextInt();
                System.out.print("Sampai: ");
        int max=new Scanner(System.in).nextInt();
        System.out.println("Bilangan genap antara "+min+" - "+max+" adalah:");
            
        for (int i = 0; i < max; i++) {
            if (min%2 == 0) {
                System.out.print(min+", ");
            }
               min++;
        }
    }
}
