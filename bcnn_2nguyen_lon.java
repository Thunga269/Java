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
public class bcnn_2nguyen_lon {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            BigInteger aa = new BigInteger(a);
            BigInteger bb = new BigInteger(b);
            BigInteger ucln = aa.gcd(bb);
            System.out.println((aa.multiply(bb)).divide(ucln));
        }
     }
}
