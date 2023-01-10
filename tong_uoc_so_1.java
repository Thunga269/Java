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
public class tong_uoc_so_1 {
    static int N = 2000000;
//    static int prime[] = new int[N+1];
    static int a[]=new int[N+1];
    public static void sang_nt() {
        for(int i = 1; i <= N; i++){
            a[i]=0; 
        }
        for(int i = 2; i*i <= N; i++){
            if(a[i]==0){
                for(int j = i*i; j <= N; j+=i) a[j]=i; //i là ước số min của j
            }
        }
        int j = 0;
        for(int i = 2; i <= N; i++){
            if(a[i]==0){//la snt
                a[i]= i; 
            }
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int b[] = new int[t+1];
        for(int i = 1; i <= t; i++) b[i]=sc.nextInt();
        long sum = 0; 

        sang_nt();
        for(int i = 1; i <= t; i++){
            int x = b[i];
            while(x!=1){
                sum += a[x];
                x /= a[x];

                    }
                }    
            System.out.println(sum);
    }
}
