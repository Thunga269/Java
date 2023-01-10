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
public class liet_ke_tu_khac_nhau_fiile {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\VANBAN.in");
        System.out.println(ws);
    }
//    public static void main(String[] args) throws FileNotFoundException {
//       File file = new File("C://Users//ASUS//Documents//NetBeansProjects//JavaApplication1//src//codeptit//DATA.in");
//       Scanner sc = new Scanner(file);
//       Set <String > s = new TreeSet<>();
//       while (sc.hasNext()){
//           String k = sc.next();
//           s.add(k);
//           
//       }
//       for (String m: s) System.out.println(m);
//    }
}
class WordSet{
    private SortedSet<String> ts = new TreeSet<>();
    public WordSet(){
        this.ts.clear();
    }
    public WordSet(String string) throws FileNotFoundException{
        File file = new File(string);
        Scanner sc = new Scanner(file);
        //String s = "";
        while(sc.hasNext()){
            String k = sc.next();
            k = k.toLowerCase();
            this.ts.add(k);
            if(k.isEmpty()) break;
        }
    }
    @Override
    public String toString(){
        String ans = "";
        for (String s : this.ts) {
            ans += (s + "\n");
        }
        return ans;
    }
}
