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
public class xau_con_LN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int i = 0;
        for(char c = 'z'; c>='a'; c--){
            for(int j = i; j < k.length(); j++){
                if(k.charAt(j)==c){
                    System.out.print(String.valueOf(k.charAt(j)));
                    i = j;
                }
            }
        }
        
    }
}
