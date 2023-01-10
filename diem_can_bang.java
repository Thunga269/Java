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
public class diem_can_bang {
    public static int BalancePoint(int []a, int n, int sum) {
        int s = 0;
        for(int i = 0; i < n; i++){
            s += a[i];
            if(s == sum+a[i]-s)
                return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                a[i]=sc.nextInt();
                sum += a[i];
            }
            System.out.println(BalancePoint(a, n, sum));
        }
    }
}
