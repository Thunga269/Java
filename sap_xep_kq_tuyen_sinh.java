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
public class sap_xep_kq_tuyen_sinh{
    public static int cnt = 1;
    public static class Student{
        String id , name ;
        double d1 , d2 ,d3 ;
        public Student(String a, String b, double c,double d,double e){
            id= a;
            name= b;
            d1= c;
            d2= d;
            d3 = e;
        }
        public String priorityScore(){
            Character x = id.charAt(2);
            if ( x== '1') return "0.5";
            if (x=='2') return "1";
            return "2.5";
        }
        public String totalScore(){
            double x = 2*d1+d2+d3+Double.valueOf(priorityScore());
            if (x==(int)x) return Integer.toString((int)x);
            return String.format("%.1f", x);
        }
        public String status(){
            double x = Double.valueOf(totalScore());
            if (x>=24) return "TRUNG TUYEN";
            return "TRUOT";
        }
        @Override
        public String toString(){
            return id+" "+name+" "+priorityScore()+" "+totalScore()+" "+status();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        List<Student> ds = new ArrayList<>();
        while (t-- >0){
            sc.nextLine();
            ds.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(ds,(Student a, Student b) -> {
            double x = Double.valueOf(a.totalScore()) , y = Double.valueOf(b.totalScore());
            if (x!=y) return Double.compare(y, x);
            return a.id.compareTo(b.id);
        });
        for (Student x : ds )System.out.println(x);
    }
}