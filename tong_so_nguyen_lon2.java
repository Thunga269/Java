/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.xau_ki_tu;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.math.*;
public class tong_so_nguyen_lon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger s1 = new BigInteger(a);
        BigInteger s2 = new BigInteger(b);
        System.out.println(s1.add(s2));
    }
}
