/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

/**
 *
 * @author Dahlah
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class randomarray {
    public static void main(String[] args) {
        Random random_Number=new Random();
        ArrayList<Integer> arr_Number = new ArrayList<>();
        
        System.out.print("Masukan panjang array: ");
        
        Scanner input_length=new Scanner(System.in);
        int arr_Length=input_length.nextInt();
        
        for (int i = 0; i < arr_Length; i++) {
            int number = random_Number.nextInt(100);
            arr_Number.add(number);
        }
        System.out.println(arr_Number);
    }
}
