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
public class xau_khac_nhau_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.equals(b)) System.out.println("-1");
            else{
                System.out.println(Math.max(a.length(), b.length()));
 
            }
        }
    }
}
