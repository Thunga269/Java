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

public class tim_tu_thuan_nghich_dai_nhat {
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
//File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.in");
//Scanner sc = new Scanner(file);
        LinkedHashMap <String, Integer> mp = new LinkedHashMap<>();
        LinkedList <String> L = new LinkedList<>();
        while(sc.hasNext()){
            String s = sc.next();
            // if(s.isEmpty()) break;
//            System.out.println(m);
            StringBuffer b = new StringBuffer(s);
            b.reverse();
            String tmp = b.toString();
            if(s.equals(tmp)) L.add(s);
            
        }
        int max = 0;
        for(String x:L)
            if(max < x.length()) max = x.length();
        for(String x:L){
            if(x.length()==max){
//                System.out.println(m);
                if(mp.get(x)==null) mp.put(x, 1);
                else mp.put(x, mp.get(x)+1);
            }
        }
        Set < String> set = mp.keySet();
        for(String x: set ) System.out.println(x+" "+mp.get(x));
    }
}