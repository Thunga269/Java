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
public class dien_thoai_cuc_gach {
    public static boolean check(String s) {
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
        while(t -- > 0){
            String s = sc.nextLine();
            s = s.toUpperCase();
            String tmp = "";
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
		if(c >= 'A' && c <= 'C') tmp += "2";
		else if(c >= 'D' && c <= 'F') tmp += "3";
		else if(c >= 'G' && c <= 'I') tmp += "4";
		else if(c >= 'J' && c <= 'L') tmp += "5";
		else if(c >= 'M' && c <= 'O') tmp += "6";
		else if(c >= 'P' && c <= 'S') tmp += "7";
		else if(c >= 'T' && c <= 'V') tmp += "8";
		else if(c >= 'W' && c <= 'Z') tmp += "9";
		}
            if(check(tmp)==true){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
