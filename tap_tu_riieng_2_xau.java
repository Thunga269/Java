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
public class tap_tu_riieng_2_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String []a = s1.split(" ");
            String []b = s2.split(" ");
            HashSet<String> a1  = new HashSet<>();
            HashSet<String> b1  = new HashSet<>();
            HashSet<String> c = new HashSet<>();
            for(int i = 0; i < a.length; i++){
                a1.add(a[i]);
//                System.out.println(a[i]);
            }
            for(int j = 0; j < b.length; j++){
                b1.add(b[j]);
//                System.out.println(b[j]);
            }
//            a1.addAll(a);
//            b1.addAll(b);
            int ok = 1;
            for(String x:a1){
                ok = 1;
                for(String y:b1){
                    if(x.equals(y)){
                        ok = 0;
                    }
                }
                if(ok ==1){
                        c.add(x);
                    }
            }
            for(String k : c){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
            
    }
}
