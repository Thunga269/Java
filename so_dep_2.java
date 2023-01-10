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
public class so_dep_2 {
    public static boolean check(String s) {
        int len = s.length();
        if(s.charAt(0)!= '8' && s.charAt(len-1)!='8') return false;
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += (s.charAt(i)-'0');
        }
        if(sum %10!=0) return false;
        return true;
    }
    public static boolean check2(String s){
        StringBuffer ss = new StringBuffer(s);
        ss.reverse();
        String tmp = ss.toString();
        if(s.equals(tmp)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0){
            String s = sc.nextLine();
            if(check(s)==true && check2(s)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
