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
public class chu_so_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '4' || c=='7'){
                sum ++;
            }
            if(sum > 7){
                break;
            }
        }
        if(sum == 4 || sum == 7)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
