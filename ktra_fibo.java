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
public class ktra_fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long[]a=new long[10001];
            a[0]=0; a[1]=1; a[2]=1;
            int i = 2; 
            if(n==0 || n==1||n==2) System.out.println("YES");
            else{
                while(a[i]<n){
                ++i;
                a[i]=a[i-1]+a[i-2];
                }
                if(a[i]==n){
                    System.out.println("YES");
                }
                else if(a[i]> 0 && a[i]!=n)
                    System.out.println("NO");
            }
            
        }
    }
}
