/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

import java.util.Scanner;

/**
 *
 * @author Dahlah
 */
public class cafeceria {
    public static void main(String[] args) {
        System.out.println("   CAFE CERIA");
        System.out.println("  ANEKA MINUMAN");
        System.out.println("===================");
        System.out.print("Special Menu: ");
        System.out.println("\n1. Soft drinks \n2. Mix juice \n3. Nescafe \n4. Soda milk \n5. Tea");
        System.out.println("===================");
        System.out.print("Silahkan masukan nama anda: ");
        Scanner input_nama= new Scanner(System.in);
        String nama= input_nama.nextLine();
        System.out.println();
        
        System.out.print("Silahkan masukan pilihan Anda: ");
        Scanner input=new Scanner(System.in);
        int selected=input.nextInt();
        switch(selected){
            case 1: System.out.println("Minuman yang Anda pesan adalah Soft drink");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terima kasih "+nama+" telah berkunjung di Cafe Ceria");
            break;
            case 2: System.out.println("Minuman yang Anda pesan adalah Mix juice");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terima kasih "+nama+" telah berkunjung di Cafe Ceria");
            break;
            case 3: System.out.println("Minuman yang Anda pesan adalah Nescafe");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terima kasih "+nama+" telah berkunjung di Cafe Ceria");
            break;
            case 4: System.out.println("Minuman yang Anda pesan adalah Soda milk");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terima kasih "+nama+" telah berkunjung di Cafe Ceria");
            break;
            case 5: System.out.println("Minuman yang Anda pesan adalah Tea");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terima kasih "+nama+" telah berkunjung di Cafe Ceria");
            break;
            default:System.out.println("Menu yang Anda pilih tidak tersedia!!");
        }
    }
}
