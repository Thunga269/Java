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
public class chuan_hoa_xau_hoten_file {
    
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.compareTo("END")==0) break;
            s =s.trim();
            s = s.replaceAll("\\s+", " ");
            String ss[]=s.split(" ");
            String res = "";
            for(int i = 0; i < ss.length; i++){
                String first = ss[i].substring(0, 1).toUpperCase();
                String second = ss[i].substring(1).toLowerCase();
                res += first+second;
                res +=" ";
            }
            System.out.println(res);
        }
    }
}
