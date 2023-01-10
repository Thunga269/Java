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
public class so_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String m = sc.nextLine();
        while(t -- >0){
            int ok = 1;
            String s = sc.nextLine();
            for(int i = 0; i < s.length()-1; i++){
                int k = s.charAt(i)-'0';
                int h = s.charAt(i+1)-'0';
//                System.out.println(h);
//                System.out.println(k);
                if(h-k == 1 || k-h==1) ok = 1;
                else{
                    ok = 0; break;
                }
            }
            if(ok == 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
