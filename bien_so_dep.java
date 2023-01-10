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
public class bien_so_dep {
    public static boolean check1(String s) {
        int dem_tang=0, dem_bang = 0, dem_loc_phat=0;
        String ss = s.substring(5, 8)+s.substring(9);
        for(int i = 0; i < 4; i++){
            int a = ss.charAt(i);
            int b = ss.charAt(i+1);
            if(a=='6' || a=='8') dem_loc_phat++;
            if(b==a) dem_bang++;
            if(b-a==1) dem_tang++;
        }
        char d = ss.charAt(4);
        if(d=='6'||d=='8') dem_loc_phat++;
        if(dem_loc_phat==5 || dem_tang==4||dem_bang==4) return true;
        if(ss.charAt(0)==ss.charAt(1) && ss.charAt(0)==ss.charAt(2) && ss.charAt(3)==ss.charAt(4)) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check1(s)==true)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

