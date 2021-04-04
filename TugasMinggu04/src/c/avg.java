/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Dahlah
 */
public class avg {

    public static void main(String[] args) {
        System.out.print("Masukan jumlah nilai: ");
        int j_nilai = new Scanner(System.in).nextInt();
        int nilai[] = new int[j_nilai];
        int t_nilai=0;
        for (int i = 0; i < j_nilai; i++) {
            System.out.print("Masukan data nilai ke-" + (i + 1) + ": ");
            nilai[i] = new Scanner(System.in).nextInt();
            t_nilai=t_nilai+nilai[i];
        }
        System.out.println();
        Arrays.sort(nilai);
        System.out.println("Nilai minimum: " + nilai[0]);
        System.out.println("Nilai maximum: " + nilai[j_nilai-1]);
        System.out.println("Nilai rata-ratanya adalah: "+t_nilai/nilai.length);
        

    }
}
