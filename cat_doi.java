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
public class cat_doi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String k = sc.nextLine();
        while(t-->0){
            
            String n = sc.nextLine();
            String s="";
            int ok = 1;
            for(int i = 0; i < n.length(); i++){
                char c = n.charAt(i);
//                System.out.println(c);
                if(c=='0'||c=='8'||c=='9'){
                    s += '0';
                }
                else if(c=='1'){
                    s += '1';
                }
                else ok = 0;
                if(ok==0){
                    System.out.println("INVALID");
                    break;
                }
            }
            if(ok == 1){
                while(s.charAt(0)=='0' && s.length()>1){
                    s=s.substring(1);
                }
                if(s.equals("0")) System.out.println("INVALID");
                else System.out.println(s);
            }
                
        }
        
    }
}
