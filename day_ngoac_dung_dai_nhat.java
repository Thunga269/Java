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
public class day_ngoac_dung_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            int m = 0;
            sc.nextLine();
            Stack <Integer> L = new Stack<>();
            L.push(-1);
            String s = sc.next();
//            System.out.println(s);
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)=='(') L.push(i);
                else{
                    L.pop();
                    if(L.size()!=0){
                        m = Integer.max(m, i-L.peek());
                    
                    }else{
                        L.push(i);
                    }
                }
            }
            System.out.println(m);
        }
    }
}
