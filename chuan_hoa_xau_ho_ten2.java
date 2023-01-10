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
public class chuan_hoa_xau_ho_ten2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            s = s.toLowerCase();
            String []a=s.split(" ");
            String res = "";
            String last = a[0].toUpperCase();
//            System.out.println(last);
            for(int i = 1; i < a.length; i++){
                String first = a[i].substring(0, 1).toUpperCase();
                String second = a[i].substring(1);
                res += first + second;
                if(i < a.length -1) res += " ";
                else res += ", ";
            }
            res += last;
            System.out.println(res);
        }
    }
}
