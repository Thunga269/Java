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
public class diem_danh2 {
    public static class Student{
        String id, name ,group, status;
        int score ;
        public Student(String a , String b, String c){
            id  =a ;
            name = b;
            group= c;
            status = "";
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        int loop  =t ;
        List<Student> ds = new ArrayList<>();
        while (t-- >0){
            sc.nextLine();
            ds.add(new Student(sc.nextLine(), sc.nextLine(), sc.next()));
        }
        while(loop -- > 0){
            String s1 = sc.next(),s2 = sc.next();
            for (Student x : ds ) if (x.id.equals(s1)){
                int rest = 10 - count(s2, 'm')-count(s2, 'v')*2;
                if (rest <0 ) rest = 0;
                if (rest ==0) x.status = "KDDK";
                x.score = rest;
            }
        }
        String s = sc.next();
        for (Student x : ds ) if (x.group.equals(s))System.out.println(x.id+" "+x.name+" "+x.group+" "+x.score+" "+x.status);
    }
    public static int count(String s, char a){
        int cnt = 0;
        for (int i = 0 ;i < s.length();++i) if (s.charAt(i)==a) ++cnt;
        return cnt;
    }
}
