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
public class bien_doi_S_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();;
        while(m -->0){
            int s = sc.nextInt();
            int t = sc.nextInt();
            Pair <Integer, Integer> u = new Pair<>();
            Pair <Integer, Integer> u1 = new Pair<>();
            Map <Integer, Integer> mp = new HashMap<>();
            LinkedList <Pair <Integer, Integer>> q = new LinkedList<Pair<Integer, Integer>>();
            u.setFirst(s); u.setSecond(0); q.add(u);
            while(q.size()!=0){
                u = q.getFirst(); q.remove(0);
                if(u.getFirst()==t){
                    System.out.println(u.getSecond()); break;
                }
                if(u.getFirst()>1 && mp.get(u.getFirst()-1)==null){
                    mp.put(u.getFirst()-1, 1);
                    u1.setFirst(u.getFirst()-1);
                    u1.setSecond(u.getSecond()+1);
                    q.addLast(u1);
                    
                }
                if(u.getFirst()<=t && mp.get(u.getFirst()*2)==null){
                    mp.put(u.getFirst()*2, 1);
                    u1.setFirst(u.getFirst()*2);
                    u1.setSecond(u.getSecond()+1);
                    q.addLast(u1);
                }
            }
        }
        
    }
}
