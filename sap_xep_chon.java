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
public class sap_xep_chon {
    public static void in(int a[], int n) {
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t+1];
        for(int i = 0; i< t; i++) a[i]=sc.nextInt();
        for(int i = 0; i < t-1; i++){
            int m = i;
            for(int j = i+1; j<t; j++)
                if(a[j]<a[m]) m =j;
            int tmp = a[i];
            a[i]=a[m];
            a[m]=tmp;
            System.out.print("Buoc "+(i+1)+": ");
            in(a, t);
            System.out.println("");
    }
    }
}
