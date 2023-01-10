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
public class mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t -->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            StringBuffer ss = new StringBuffer(s);
            ss.reverse();
            String tmp = ss.toString();
            if(s.equals(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
