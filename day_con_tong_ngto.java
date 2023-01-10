/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
import java.math.*;
public class day_con_tong_ngto {
    public static boolean prime(int n) {
        if (n< 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i==0) return false;
        return true;
    }
    public static void Try(int t, int n,int []c, ArrayList<Integer> a, ArrayList<ArrayList<Integer>> kq) {
        for(int i = 0; i <= 1; i++){
            c[t]=i;
            if(t==n-1){
                ArrayList<Integer> b = new ArrayList<>();
                int sum = 0;
                for(int k = 0; k < n; k++){
                    if(c[k]==1){
                        sum += a.get(k);
                        b.add(a.get(k));
                    }
                }
                if(prime(sum))kq.add(b);
            }else Try(t+1, n, c, a, kq);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int c[] = new int[n+1];
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<ArrayList<Integer>> kq = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt(); a.add(x); c[i]=0;
            }
            a.sort((o1, o2) -> o2-o1);
            Try(0,n, c, a, kq);
            for(int i = 0; i < kq.size(); i++){
                for(int j = 0; j < kq.get(i).size(); j++){
                    System.out.print(kq.get(i).get(j)+" ");
                }
                System.out.println("");
            }
        }
    }
}
