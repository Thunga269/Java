/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class word_set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
class WordSet{
    private SortedSet<String> st = new TreeSet<>();

    public WordSet() {
        this.st.clear();
    }

    public WordSet(String s) {
        s = s.toLowerCase();
        String a[]=s.split(" ");
        for(int i = 0; i < a.length; i++) this.st.add(a[i]);
    }
    public WordSet union(WordSet s){
        WordSet res = new WordSet();
        for(String k : s.st){
            res.st.add(k);
        }
        for(String k : this.st){
            res.st.add(k);
        }
        return res;
    }
    public WordSet intersection(WordSet s){
        WordSet res = new WordSet();
        for(String k : s.st){
            if(this.st.contains(k))       
                res.st.add(k);
        }
        return res;
    }
    @Override
    public String toString(){
        String ans="";
        for (String s : this.st) {
            ans += s + " ";
        }
        return ans;
    }  
}