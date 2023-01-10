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
public class rut_gon_xau_ki_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(true){
            int j = 0;
            for(int i = 0; i <s.length()-1; i++){
                if(s.charAt(i)== s.charAt(i+1)){
                    j++;
                    s = s.substring(0, i)+s.substring(i+2, s.length());
                }
            }
            if(j==0) break;
        }
        if(s.length()==0) System.out.println("Empty String");
        else System.out.println(s);
    }
 
}
