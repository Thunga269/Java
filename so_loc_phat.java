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

public class so_loc_phat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            int n = sc.nextInt();
            List <Long> m = new ArrayList<>();
            LinkedList <String> L = new LinkedList<>();
            L.add("6");
            L.add("8");
            while(L.size()!=0){
                String top = L.getFirst();
                L.remove(0);
                if (top.length()>n) break;
                if(top.length()<=n){
//                    System.out.println(top);
                    m.add(Long.valueOf(top));
                    L.addLast(top+"6");
                    L.addLast(top+"8");
                }
            }
            System.out.println(m.size());
            Collections.sort(m);
            for(int i = m.size()-1; i >= 0; i--){
                System.out.print(m.get(i)+" ");
            }
            System.out.println("");
        }
        
    }
}
