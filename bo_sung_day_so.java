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
public class bo_sung_day_so {
    public static boolean Binary_search(int []a, int l, int r, int x) {
        int mid = (int)(l+r)/2;
        while(l <= r){
            if(a[mid]<x)
                l = mid+1;
            if(a[mid]==x) return true;
            if(a[mid]>x)
                r = mid-1;
            mid = (int)(l+r)/2;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n+1];
            for(int i = 0; i < n; i++)
               a[i]= sc.nextInt();
//            Arrays.sort(a);
            int cnt = 0;
//            System.out.println(a[n-1]);
            for(int i = 1; i <= a[n-1]; i++){
               if(!Binary_search(a,0, n-1, i)){
                   cnt++;
                   System.out.println(i);
                }
            }
            if(cnt==0) System.out.println("Excellent!");
            
        }
    
}
