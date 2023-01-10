/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.math.*;
import java.util.Arrays;
/**
 *
 * @author ASUS
 */
public class xau_day_du {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
       
        while (t-- > 0) {
            String s = sc.nextLine();
            int k = Integer.valueOf(sc.nextLine());
            int []M = new int[200];
            Arrays.fill(M, 0);
            for(int i = 0; i < s.length(); i++)
                M[s.charAt(i)]++;
            int a = 0;
            for(int i = 'a'; i <= 'z'; i++)
                if(M[i]>0) a++;
            if(k+a>=26 && s.length()>=26) System.out.println("YES");
            else System.out.println("NO");
        }
        }
}
