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
public class dao_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0){
            String s = sc.nextLine();
            String []ss = s.split(" ");
            String h = "";
            for(String k:ss){
                StringBuffer kk = new StringBuffer(k);
                kk.reverse();
                String tmp = kk.toString();
                h += tmp;
                h += " ";
            }
            System.out.println(h);
        }
    }
}
