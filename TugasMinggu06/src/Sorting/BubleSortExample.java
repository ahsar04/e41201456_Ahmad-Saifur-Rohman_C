/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Ahmad Saifur Rohman
 */
public class BubleSortExample {
    static void bubleSort(int[] arr){
        int n=arr.length;//panjang index
        int temp=0;//variable yg digunakan untuk proses pertukaran
        System.out.println("Sorting Proccess");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]) {
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    //menampilkan hasil swap secara berkala
                    for (int k = 0; k < n; k++) {
                    System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,60,35,2,45,320,5};
        System.out.println("Array Before Buble Sort");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println();
        bubleSort(arr);
        
        System.out.println("Array After Buble Sort");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
