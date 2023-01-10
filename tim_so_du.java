/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tim_so_du {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0){
            String s = sc.nextLine();
            int res, n = s.length();
            if(n == 1){
                res = (s.charAt(0)-48)%4;
            }else{
                res = (s.charAt(n-2)-48)*10+(s.charAt(n-1)-48);
                res %= 4;
            }
            if(res == 0) System.out.println("4");
            else System.out.println("0");
        }
    }
}
