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
public class chia_het_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String []ss = s.split(" ");
            String a = ss[0];
            String b = ss[1];
            BigInteger aa = new BigInteger(a);
            BigInteger bb = new BigInteger(b);
            if(aa.compareTo(bb)<0){
                BigInteger p = aa;
                aa = bb;
                bb = p;
            }
            BigInteger uoc = aa.divide(bb);
//            System.out.println(uoc);
            if(aa.compareTo(uoc.multiply(bb))==0)
                System.out.println("YES");
            else System.out.println("NO");
//            System.out.println(aa.divide(bb));
        }
    }
}
