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
public class xau_nhi_phan {
    public static long F[] =  new long[93];
    public static void Fibo() {
        F[0]=0;
        F[1]=1;
        for(int i = 2; i < 93; i++)
            F[i]=F[i-2]+F[i-1];
    }
    public static int check(int n, long k) {
        if(n==1) return 0;
        if(n==2) return 1;
        if(k <= F[n-2]) return check(n-2, k);//neu k nam trong xau (n-2)
        return check(n-1, k-F[n-2]);//neu k nam trong xau (n-1)
                
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibo();
        int t = sc.nextInt();
        while(t -->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(check(n, k));
        }
        
    }
}
