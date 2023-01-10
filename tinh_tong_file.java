/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class tinh_tong_file {
    
    public static boolean check(String s) {
        int cnt = 0;
        if(s.length()> 9) return false;
        s =s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') return false;
        }
        return true;
        
}
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C://Users//ASUS//Documents//NetBeansProjects//JavaApplication1//src//codeptit//DATA.in");
        Scanner sc = new Scanner(file);
        long sum = 0;
        while(sc.hasNext()){
            String k = sc.next();
            if(check(k)==true){
                int i = Integer.parseInt(k);
                sum += i;
                }
            }
        
           
        System.out.println(sum);
    }
}
