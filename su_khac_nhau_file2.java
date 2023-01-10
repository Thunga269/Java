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
public class su_khac_nhau_file2 {
    public static void main(String[] args) throws IOException{
       
        FileInputStream inp=new FileInputStream("DATA.IN");
        DataInputStream inps=new DataInputStream(inp);
        
        Map <Integer, Integer> mp=new TreeMap<>();
        while (true){
            try{
                int x=inps.readInt();
                if (mp.get(x)==null) mp.put(x,1);
                else mp.put(x, mp.get(x)+1);
            }
            catch (EOFException e){
                break;
            }
        }
        inp.close();
        Set <Integer> set=mp.keySet();
        for (int x:set) System.out.println(x+" "+mp.get(x));
    }
}


