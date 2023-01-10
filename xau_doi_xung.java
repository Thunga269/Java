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
public class xau_doi_xung {
//    public static boolean check(String s) {
//        StringBuffer ss = new StringBuffer(s);
//        ss.reverse();
//        String tmp = ss.toString();
//        if(s.equals(tmp)) return true;
//        return false;
//    }
    public static boolean check2(String s) {
        int len = s.length(), dem = 0;
        for(int i = 0; i < (int)len/2; i++){
            if(s.charAt(i)!= s.charAt(len-i-1)){
                dem++;
            }
            if(dem > 1) return false;
        }
        if(dem == 0 && len %2!=0) return true;
        if(dem == 1) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s = sc.nextLine();
            if(check2(s)==true){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
