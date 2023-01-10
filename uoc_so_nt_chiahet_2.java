/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.math.*;
public class uoc_so_nt_chiahet_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = (int)Math.sqrt(n);//xet 2 ben i & n/i
            int dem = 0;
            for(int i = 1; i <= k; i++){
                if(n%i==0 && i %2==0 & n%2==0) dem++;
                if(n%i==0 && (n/i)%2==0 && n%2==0) dem++;
            }
            if(k*k == n && dem > 0) System.out.println(dem-1);
            else System.out.println(dem);
        }
    }
}
