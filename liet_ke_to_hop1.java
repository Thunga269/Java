/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class liet_ke_to_hop1 {
    
    public static void sinh(int n, int k) {
        int a[]=new int[k+1];
        int dem = 0;
        for(int i = 1; i <= k; i++) a[i]=i;
        while(1>0){
            for(int i = 1; i <= k; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println("");
            dem++;
            
            int j = k;
            while(a[j]>= n-k+j && j > 0) j--;
            if(j==0) break;
            a[j]++;
            for(int i = j+1; i<= k; i++) a[i]=a[j]+(i-j);
        }
        
        System.out.println("Tong cong co "+dem+" to hop");        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while(t -- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sinh(n, k);
        
    }
}
