/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.util.Scanner;

/**
 *
 * @author Dahlah
 */
public class promo {
    public static void main(String[] args) {
        int hrg_min=10000;
        
        System.out.println("---------------------------------------------");        
        System.out.println("        Kharisma Agung Plaza (KAP)");
        System.out.println("         Promo Belanja Berhadiah");
        System.out.println("     Khusus Pembelian 5 Barang Pertama");
        System.out.println("      Dengan harga minimum Rp. "+hrg_min);
        System.out.println("=============================================");
        
        System.out.print("Masukan nama pembeli: ");
        Scanner input_nama=new Scanner(System.in);
        String nama=input_nama.nextLine();
        System.out.println();
        
        System.out.print("Masukan harga barang ke-1: ");
        Scanner input_hrg_brg1=new Scanner(System.in);
        int hrg_brg1=input_hrg_brg1.nextInt();
        System.out.print("Masukan harga barang ke-2: ");
        Scanner input_hrg_brg2=new Scanner(System.in);
        int hrg_brg2=input_hrg_brg2.nextInt();
        System.out.print("Masukan harga barang ke-3: ");
        Scanner input_hrg_brg3=new Scanner(System.in);
        int hrg_brg3=input_hrg_brg3.nextInt();
        System.out.print("Masukan harga barang ke-4: ");
        Scanner input_hrg_brg4=new Scanner(System.in);
        int hrg_brg4=input_hrg_brg4.nextInt();
        System.out.print("Masukan harga barang ke-5: ");
        Scanner input_hrg_brg5=new Scanner(System.in);
        int hrg_brg5=input_hrg_brg5.nextInt();
        int total=hrg_brg1+hrg_brg2+hrg_brg3+hrg_brg4+hrg_brg5;
        System.out.println("Total harga pembelian atas Nama "+nama+" adalah Rp. "+total);
        
        System.out.println();
        if (hrg_brg1>=hrg_min&&hrg_brg2>=hrg_min&&hrg_brg3>=hrg_min&&hrg_brg4>=hrg_min&&hrg_brg5>=hrg_min) {
            System.out.println("Selamat.....");
            System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
        }
        
        System.out.println("---------------------------------------------");  
                System.out.println("                 Terima kasih");
        System.out.println(" Anda sudah belanja di Kharisma Agung Plaza");
    }
}
