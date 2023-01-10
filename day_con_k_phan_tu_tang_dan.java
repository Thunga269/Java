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
public class day_con_k_phan_tu_tang_dan {
    public static int n, k;
    public static void Try(int t, int c[],ArrayList<Integer> a, ArrayList<ArrayList<Integer>> kq) {
        for(int i = c[t-1]+1; i <= n-k+t; i++){
            c[t]=i;
            ArrayList<Integer> b = new ArrayList<>();
            if(t == k){
                for(int h = 0; h < n; h++){
                    b.add(a.get(i));
                }
               kq.add(b);
        }else Try(t+1, c, a, kq);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t --> 0){
            n = sc.nextInt();
            k = sc.nextInt();
            int c[]=new int[n+1];
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<ArrayList<Integer>> kq = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                a.add(x);
                c[i]=0;
            }
            a.sort((o1,o2)-> o1-o2);
            Try(0, c, a, kq);
            for(int i = 0; i < kq.size(); i++){
                for(int j = 0; j < kq.get(i).size(); j++){
                    System.out.print(kq.get(i).get(j)+" ");
                }
                System.out.println("");
            }
        }
        
    }
}
