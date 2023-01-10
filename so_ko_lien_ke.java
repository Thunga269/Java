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
public class so_ko_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String m = sc.nextLine();
        while(t -- >0){
            int ok = 1;
            int sum = 0;
            String s = sc.nextLine();
            for(int i = 0; i < s.length()-1; i++){
                int k = s.charAt(i)-'0';
                int h = s.charAt(i+1)-'0';
                sum += k;
                if(h-k == 2 || k-h==2) ok = 1;
                else{
                    ok = 0; break;
                }
            }
            
//            System.out.println(sum);
            if(ok == 0) System.out.println("NO");
            else {
                sum = sum+ s.charAt(s.length()-1)-'0';
//                System.out.println(sum);
                if(sum %10==0)
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
