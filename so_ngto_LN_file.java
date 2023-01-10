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
public class so_ngto_LN_file {
    public static boolean Prime(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
//       Map<Integer, Integer> mp = new TreeMap<>();
//        Map<Integer, Integer> 
        FileInputStream sc = new FileInputStream("DATA.in");
        try{
            ObjectInputStream readStream = new ObjectInputStream(sc);
//            ArrayList<Integer> arr = new ArrayList<>(); readStream.readObject();
            ArrayList<Integer> arr = (ArrayList<Integer>) readStream.readObject();
            for (Integer it: arr){
                if(Prime(it)){
                   if(mp.get(it)==null) mp.put(it, 1);
                   else mp.put(it, mp.get(it)+1);
                }
            }
            readStream.close();
        }catch(ClassNotFoundException e){
            
        }
        
        List<Integer> l = new ArrayList<>();
        Set <Integer> set = mp.keySet();
        int d= 0;
        for (Integer x: set){
            l.add(x);
        }
        Collections.sort(l);
        for(int i = l.size()-1; i >= 0;i--){
            if(d==10) break;
            System.out.println(l.get(i)+" "+ mp.get(l.get(i)));
            d++;
        }
    }
    
}
