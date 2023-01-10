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
public class so_tam_phan {
    public static boolean check(String s) {
        for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)!='0' && s.charAt(i)!='1'&&s.charAt(i)!='2') 
                    return false;
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0){
            String s = sc.nextLine();
            if(check(s)==true){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
