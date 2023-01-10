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
public class so_dep3 {
    public static boolean check(String s) {
        StringBuffer ss = new StringBuffer(s);
        ss.reverse();
        String tmp = ss.toString();
        if(s.equals(tmp)) return true;
        return false;
    }
    public static boolean check2(String s) {
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c!='2' && c !='3'&&c!='5'&&c !='7') return false;
        }
        return true;
    }    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0){
            String s = sc.nextLine();
            if(check(s)==true && check2(s)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
