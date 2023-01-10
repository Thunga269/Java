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
public class giao_2_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[m+1];
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int i = 0; i < n; i++){
            a[i]=sc.nextInt();
            set1.add(a[i]);
        }
        for(int i = 0; i < m; i++){
            b[i]=sc.nextInt();
            set2.add(b[i]);
        }
//          set.addAll(a);
           set1.retainAll(set2);
    for(int x:set1){
        System.out.print(x+" ");
    }
    }
}
