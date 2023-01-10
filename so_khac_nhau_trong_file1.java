/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.math.*;
import java.util.*;
public class so_khac_nhau_trong_file1 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C://Users//ASUS//Documents//NetBeansProjects//JavaApplication1//src//codeptit//DATA.in");
        Scanner sc = new Scanner(file);
        Vector<Integer> v = new Vector<>();
        while(sc.hasNext()){
            int t = sc.nextInt();
            v.add(t);
        }
        int a[] = new int[1001];
        for(int i = 0; i <1001; i++) a[i]=0;
        for(int i: v){
            a[i]++;
        }
        for(int i = 0; i<1001; i++){
            if (a[i] > 0){
                System.out.println(i +" "+a[i]);
            }
        }
    }
}
