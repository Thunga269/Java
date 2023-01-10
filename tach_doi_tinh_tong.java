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
import java.io.*;
import java.math.BigInteger;
public class tach_doi_tinh_tong {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        String s = sc.nextLine();
        if(s.length()==1) System.out.println(s);
        else{
            while(true){
            if(s.length()==1) break;
        
            int l = s.length()/2;
            String s1 = s.substring(0, l);
            String s2 = s.substring(l);
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger c = a.add(b);
            s = c.toString();
            System.out.println(s);
            
        }
        }
        
//        System.out.println(s);
    }
}
