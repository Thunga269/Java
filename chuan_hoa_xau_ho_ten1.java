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
public class chuan_hoa_xau_ho_ten1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            s = s.toLowerCase();
            String []a = s.split(" ");
            String res = "";
            for(String x:a){
                String first = x.substring(0,1).toUpperCase();
                String second = x.substring(1);
                res = res+ first+second +" ";
//                System.out.println(x);
            }
            System.out.println(res);
        }
    }
}
