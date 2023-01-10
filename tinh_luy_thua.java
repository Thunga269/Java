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
public class tinh_luy_thua {
    public static long M = (long)1e9+7;
    public static long powM(long n, long k) {
        if(k==0) return 1;
        long x = powM(n, k/2);
        if(k%2==0) return (long)x*x%M;
        else return n*(x*x%M)%M;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1>0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            else{
                System.out.println(powM(a, b));
            }
        }
    }
}
