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

public class loai_bo_so_nguyen_file {
    public static boolean check(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i)>='0' && s.charAt(i)<='9') cnt++;
        return cnt == s.length() && s.length()<=9;
    }
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        List<String> L = new ArrayList<>();
        while(sc.hasNext()){
            String k = sc.next();
            L.add(k);
        }
        Collections.sort(L);
        for(String s: L)
            if(!check(s)) System.out.print(s+" ");
    }
}
