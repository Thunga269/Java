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
public class liet_ke_theo_thu_tu_xuat_hien {
    public static void main(String [] args) throws IOException, ClassNotFoundException{
        Set<String> res = new LinkedHashSet<>();
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\NHIPHAN.in");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> arr = (ArrayList<String>) ois.readObject();
            
            ois.close();
            fis.close();
        }catch(ClassNotFoundException e){
            
        }
        
        
    }
}
