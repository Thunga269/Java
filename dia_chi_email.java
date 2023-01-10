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
public class dia_chi_email {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<String> v = new ArrayList<String>();
        while (t-- > 0){
            String s = sc.nextLine();
            s=s.toLowerCase().trim();
            String str[] = s.split("\\s+");
            String res =str[str.length-1];
            for (int i = 0 ; i < str.length-1;++i) res += str[i].charAt(0);
            final String res1 = res;
            long cnt = v.stream().filter(ch -> ch.equals(res1)).count()+1;
            v.add(res);
            if (cnt ==1 ) System.out.println(res+"@ptit.edu.vn");
            else System.out.println(res+cnt+"@ptit.edu.vn");
        }
   }
}
