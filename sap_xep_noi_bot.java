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
public class sap_xep_noi_bot {
    public static void in(int a[], int n) {
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t+1];
        for(int i = 0; i< t; i++) a[i]=sc.nextInt();
        for(int i = 0; i <t-1; i++){
            for(int j = 0; j < t -1-i; j++){
                if(a[j]> a[j+1]){
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
            System.out.print("Buoc "+(i+1)+": ");
            in(a, t);
            int mark = 0;
            for(int k = 0; k < t-1; k++){
                if(a[k]>a[k+1]) mark =1;
            }
            if(mark==0) break;
        }
    }
}
