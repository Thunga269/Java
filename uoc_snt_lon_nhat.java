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
public class uoc_snt_lon_nhat {
    public static int check(long n) {
        if(n < 2) return 0;
        else{
            for(long i = 2; i*i<= n; i++) 
                if(n%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            long n = sc.nextLong();
            long max = 0;
            if(check(n)==1) System.out.println(n);
            else{
                for(long i = 2; i*i <= n; i++){
                    if(n%i==0){
                        if(check(i)==1 && i > max) max = i;
                        if(check(n/i)==1 && n/i>max) max = n/i;
                    }
                }
                System.out.println(max);
            }
            
        }
    }
}
