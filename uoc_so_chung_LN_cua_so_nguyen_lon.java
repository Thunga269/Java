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
public class uoc_so_chung_LN_cua_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            
            System.out.println(A.gcd(B));
        }
    }
}
