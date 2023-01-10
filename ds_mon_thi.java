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
import java.io.File;
import java.io.FileNotFoundException;
public class ds_mon_thi {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File ("C://Users//ASUS//Documents//NetBeansProjects//JavaApplication1//src//codeptit//MONHOC.in");
        Scanner sc = new Scanner(file);
        String x = sc.nextLine();
        int n = Integer.valueOf(x);
	x.isEmpty();
        List<Subject> M = new ArrayList<>();
        for (int i = 0;i< n; i++){
            M.add(Subject.nextSubject(sc));
        }
        Collections.sort(M, new Comparator<Subject>(){
            @Override
            public int compare(Subject s1, Subject s2){
                return s1.getMa().compareTo(s2.getMa());
            }
            
        });
        for(Subject s:M){
            s.Show();
        }
        sc.close();
        }
}
class Subject{
    private String ma, ten, hinhthuc;

    public Subject() {
    }

    public Subject(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public String getHT(){
        return hinhthuc;
    }
    public static Subject nextSubject(Scanner sc){
        Subject s = new Subject();
        s.ma = sc.nextLine();
        s.ten = sc.nextLine();
        s.hinhthuc = sc.nextLine();
        return s;
    }
    public void Show(){
        System.out.println(this.ma +" "+this.ten+" "+this.hinhthuc);
    }
}