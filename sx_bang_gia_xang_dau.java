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
public class sx_bang_gia_xang_dau {
    public static class Petroleum{
        String id ;
        long quantity;
        public Petroleum(String a , long b){
            id = a;
            quantity = b;
        }
        public String brand(){
            String s = id.substring(id.length()-2);
            if (s.equals("BP")) return "British Petro";
            if (s.equals("ES")) return "Esso";
            if (s.equals("SH")) return "Shell";
            if (s.equals("CA")) return "Castrol";
            if (s.equals("TN")) return "Trong Nuoc";
            return "Mobil";
        }
        public long price(){
            Character x = id.charAt(0);
            if (x=='X') return 128000;
            if (x=='D') return 11200;
            return 9700;
        }
        public long Cash(){
            return quantity*price();
        }
        public long tax(){
            if (id.substring(id.length()-2).equals("TN")) return 0;
            Character x = id.charAt(0);
            if (x=='X') return Cash()*3/100;
            if (x=='D') return Cash()*35/1000;
            return Cash()*2/100;
        }
        public long totalCash(){
            return Cash()+tax();
        }
        @Override
        public String toString(){
            return id+" "+brand()+" "+price()+" "+tax()+" "+totalCash();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        List<Petroleum> ds = new ArrayList<>();
        while (t-- >0)   ds.add(new Petroleum(sc.next(),sc.nextLong()));
        Collections.sort(ds,(Petroleum a , Petroleum b) -> Long.compare(b.totalCash(), a.totalCash()));
        for (Petroleum x : ds) System.out.println(x);
    }
}
