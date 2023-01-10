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
public class so_khac_nhau_file3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.in");
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(fis);
//            ArrayList<Integer> arr = new ArrayList<>(); readStream.readObject();
            ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
            for (Integer it: arr){
                
                   if(mp.get(it)==null) mp.put(it, 1);
                   else mp.put(it, mp.get(it)+1);
                
            }
            ois.close();
            fis.close();
        }catch(ClassCastException e){
            
        }
        Set <Integer> set = mp.keySet();
        List<Integer> l = new ArrayList<>();
        for (Integer x: set) l.add(x);
        Collections.sort(l);
        for(Integer x: l){
            System.out.println(x +" "+mp.get(x));
        }
       
    }
}
