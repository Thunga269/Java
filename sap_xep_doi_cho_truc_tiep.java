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
public class sap_xep_doi_cho_truc_tiep {
    public static void in(int a[], int n) {
        for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i = 0; i < n; i++) a[i]=sc.nextInt();
        for(int i = 0; i < n-1; i++){
//            System.out.print("Buoc " + (i+1) + ": ");
            for(int j = i+1; j<n; j++){
                if(a[i]>a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }   
                
            }
            System.out.print("Buoc "+(i+1)+": ");
            in(a, n);
            System.out.println("");
            
            
        }
        
    }
}
