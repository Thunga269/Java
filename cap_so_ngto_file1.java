/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
import java.io.*;
public class cap_so_ngto_file1 {
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
        SortedSet<Integer> st1 = new TreeSet<>();
        SortedSet<Integer> st2 = new TreeSet<>();
        boolean [] vs = new boolean[1000005];
        try{
            FileInputStream fis = new FileInputStream("DATA1.in");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
            for(Integer x: arr){
                if(Prime(x))
                    st1.add(x);
            }
            ois.close();
            fis.close();
        }catch(ClassNotFoundException e){
        
        }
        try{
            FileInputStream fis = new FileInputStream("DATA2.in");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
            for(Integer x: arr){
                if(Prime(x))
                    st2.add(x);
            }
            ois.close();
            fis.close();
        }catch(ClassNotFoundException e){
        
        }
        
        for (Integer it: st1){
            if(it < 1000000 - it && st2.contains(1000000 - it) && !vs[it]){
                System.out.println(it + " " + (1000000 - it));
                vs[it] = true;
            }
        }
    }
}
