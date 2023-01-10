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
public class lua_chon_tham_lam {
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t--> 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            
            int []lon = new int[n+1];
            int []nho = new int[n+1];
            if(s == 0 || s > n*9){
                System.out.println("-1 -1");
                continue;
                }
            else if(n==0 && s==0){
                    System.out.println("0 0");
            }else{
                for(int i = 0; i < n; i++){
                    if(s > 9){
                        lon[i] = nho[i]=9;
                        s-=9;
                    }else{
                        lon[i] = nho[i]=s;
                        s=0;
                    }
                    
                }
            }
            // 990 -> 981 -> 189
            if(nho[n -1]==0){
                nho[n-1] = 1;
                for(int i = n-2; i >= 0; i--){
                    if(nho[i]!=0){
                        nho[i] -= 1;
                        break;
                    }
                }
            }
            for(int i = n-1; i>=0; i--) System.out.print(nho[i]);
            System.out.print(" ");
            for(int i = 0; i < n; i++) System.out.print(lon[i]);
        }
            
    }
}
