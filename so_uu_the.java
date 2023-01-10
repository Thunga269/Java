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
public class so_uu_the {
    public static int check(String s) {
        if(s.charAt(0) =='0') return 0;
        int len = s.length();
        int dem_c=0, ok = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                if((s.charAt(i)-'0')%2==0) dem_c++; 
            }else
                return 0;
            }
        int dem_l = len-dem_c;
        if(dem_c>dem_l && len%2==0) return 2;
        if(dem_c<dem_l && len%2!=0) return 2;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0){
            String s = sc.nextLine();
             
            if(check(s)==2) System.out.println("YES");
            else if(check(s)==1) System.out.println("NO");
            else System.out.println("INVALID");
        }
    }
}
