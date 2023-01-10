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
public class so_xa_cach {
    public static int ok;
    public static void out(int a[], int n) {
        for(int i = 1; i <= n; i++)
            System.out.print(a[i]);
        System.out.println("");
    }
    public static boolean check(int a[], int n) {
        for(int i = 1; i <= n-1; i++){
            int tmp = Math.abs(a[i+1]-a[i]);
            if(tmp==1) return false;
        }
        return true;
    }
    public static void sinh_hoan_vi(int a[], int n) {
        for(int i = 1; i <= n; i++) a[i]=i;
        
        while(1>0){
            if(check(a, n)==true) out(a, n);
//            for(int i = 1; i <= n; i++){
//                System.out.print(a[i]);
//            }
//            System.out.println("");
            int j = n-1;
            while(j>0 && a[j]>a[j+1]) j--;
            if(j==0) break;
            int k = n;
            while(a[k] < a[j]) k--;
            int tmp = a[k];
            a[k] = a[j];
            a[j] = tmp;
            Arrays.sort(a, j+1, n+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int t = sc.nextInt();
        while(t -->0){
            int N = sc.nextInt();
            int a[]=new int[N+1];
            
            sinh_hoan_vi(a, N);
            
        }
    }
}
