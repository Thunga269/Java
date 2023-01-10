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
public class boi_so_NN_n_so_nguyen_duong_dau_tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[]=new int[101];//đếm số lượng số nguyên tố là ước của các số từ 2-> n
            for(int i = 2; i <= n; i++){
                int j = 2, k = i, dem = 0;
                while(k>1){
                    if(k%j==0){
                        dem++;
                        k/=j;
                        if(a[j] < dem) a[j] = dem;
                    }else{
                        j++;
                        dem = 0;
                    }
                }
            }
//            for(int i = 2; i <= n; i++){
//                System.out.println(a[i]);
//            }
            long sum = 1;
            for(int i = 0; i <= 100;i++){
                if(a[i]!=0){
                    int p = a[i];
                    while(p > 0){
                        sum = (long) sum * i;
                        p--;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
