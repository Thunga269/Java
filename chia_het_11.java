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
public class chia_het_11 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
       
        while (t-- > 0) {
       
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger("11");
        BigInteger uoc = a.gcd(b);
        if(uoc.compareTo(b)==0) System.out.println("1");
        else System.out.println("0");
    }
    }
}
