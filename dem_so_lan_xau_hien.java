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
public class dem_so_lan_xau_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 1;
        while(t --> 0){
            int n = sc.nextInt();
            int a[] = new int[n+1];
            int dem[] = new int[100001];
            for(int i = 0; i < 100001; i++) dem[i]=0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                dem[a[i]]++;
            }
                
//            Arrays.sort(a);
            
            System.out.println("Test "+ k+":");
            k++;
            for(int i = 0;i< n; i++){
                if(dem[a[i]]>0){
                    System.out.println(a[i] +" xuat hien "+ dem[a[i]]+" lan");
                    dem[a[i]]=0;
                }
        }
        }
    }
}
    

