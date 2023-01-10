/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.math.*;
public class sap_xep_chen {
//    public static void in(int a[], int n) {
//        for(int i = 0; i < n; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println("");
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t+1];
        for(int i = 0; i< t; i++) a[i]=sc.nextInt();
        System.out.println("Buoc 0: "+a[0]);
        for(int i = 1; i < t; i++){
            int key = a[i];
            int j = i-1;
            System.out.print("Buoc "+(i)+": ");
            while(j >= 0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            for(int k = 0; k<i+1; k++)
                System.out.print(a[k]+" ");
            
            System.out.println("");
        }
    }
}
