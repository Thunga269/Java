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
public class day_con_tang_dan {
   public static ArrayList<Integer> ar = new ArrayList<>();
   public static ArrayList <Integer> v = new ArrayList<>();
   public static ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
   public static int n;
    public static void Try(int pos) {
        for(int i = pos+1; i <= n; i++){
            if(ar.get(i)>ar.get(pos)){
                v.add(ar.get(i));
                if(v.size()>1){
                    ans.add(v);
                }
                Try(i);
                v.remove(v.get(v.size()-1));
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DEMO.in");
        Scanner sc = new Scanner(file);
        n = sc.nextInt();
        ArrayList <String> x = new ArrayList<>();
        ar.add(0);
        for(int i = 1; i <= n; i++) ar.add(sc.nextInt());
       
        
        Try(0);
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
            String k = "";
            for(int j = 0; j < ans.get(i).size(); j++){
                k += String.valueOf(ans.get(i).get(j));
                k += " ";
            }
//            System.out.println(k);
            x.add(k);
        }
        Collections.sort(x);
        for(String o :x) System.out.println(o);
    }
}
