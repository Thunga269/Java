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
public class hinh_sao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] check = new int[n+1];
        for (int i = 0 ; i < n-1 ;++i ) {
            int x = sc.nextInt(), y = sc.nextInt();
            check[x]++;
            check[y]++;
        }
        if(isStar(check, n)) System.out.println("Yes"); else System.out.println("No");
   }
    public static boolean isStar(int []check,int n){
        int pos=0;
        for (int i = 1 ; i <= n ;++i) if (check[i] == n-1 )pos = i;
        for (int i = 1 ; i <= n ;++i) if (i!=pos && check[i]!=1) return false;
        return true;
    }
}
