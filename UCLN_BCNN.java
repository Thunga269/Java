/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.math.*;
public class UCLN_BCNN {
//    public static int Uc(int a, int b) {
//        if(b==0) return a;
//        return Uc(b, a%b);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger ucln = a.gcd(b);
            BigInteger bcnn = (a.multiply(b)).divide(ucln);
            System.out.print(bcnn);
            System.out.print(" ");
            System.out.println(ucln);
        }
    }
}
