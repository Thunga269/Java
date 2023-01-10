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
public class so_la_ma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        Map <Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
//        System.out.println(mp.get('M'));
        while(t -->0){
            String s = sc.nextLine();
            int sum = mp.get(s.charAt(s.length()-1));
            for(int i = s.length()-2; i >= 0; i--){
                int sau = mp.get(s.charAt(i+1));
                
                int truoc = mp.get(s.charAt(i));
                if(sau > truoc){
                    sum -= truoc;
                }else sum += truoc;
            }
            System.out.println(sum);
        }
    }
 
}
