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
public class lop_íntset {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}

class IntSet{
    private SortedSet<Integer> st = new TreeSet<>();

    public IntSet() {
        this.st.clear();
    }

    public IntSet(int a[]) {
        int n = a.length;
        for(int i = 0; i < n; i++) this.st.add(a[i]);
    }
    public IntSet union(IntSet s){
        IntSet res = new IntSet();
        for(Integer k : s.st){
            res.st.add(k);
        }
        for(Integer k : this.st){
            res.st.add(k);
        }
        return res;
    }
    public IntSet intersection(IntSet s){
        IntSet res = new IntSet();
        for(Integer k : s.st){
            if(this.st.contains(k))       
                res.st.add(k);
        }
        return res;
    }
    @Override
    public String toString(){
        String ans="";
        for (Integer s : this.st) {
            ans += s + " ";
        }
        return ans;
    }  
}