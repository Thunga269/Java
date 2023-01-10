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
public class cap_so_tong_bang_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            long n = sc.nextInt();
            long k = sc.nextInt();
            List<Long> L = new ArrayList<>();
            Map <Long, Long> mp = new HashMap<>();
            for(long i = 0; i < n; i++){
                long p = sc.nextLong();
                L.add(p);
                if(mp.get(p)==null) mp.put(p, Long.valueOf(1));
                else mp.put(p, mp.get(p)+1);
                
            }
            Set <Long> set = mp.keySet();
            long s = 0;
            for(long x: set){
                if(x*2==k)
                    s += mp.get(x) * (mp.get(x)-1);
                else if(mp.get(k-x)!=null)
                    s += mp.get(x) * mp.get(k-x);
            }
            s/=2;
            System.out.println(s);
            
        }
    }
}
