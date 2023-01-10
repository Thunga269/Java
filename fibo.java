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
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[100];
            a[0]=0; 
            a[1]=1;
            for(int i = 2; i <= n; i++){
                a[i]=a[i-1]+a[i-2];
            }
            System.out.println(a[n]);
        }
    }
}
