/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author Dahlah
 */
public class array2d {
    public static void main(String[] args) {
        int arr[][]={{5,6,1,7},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
