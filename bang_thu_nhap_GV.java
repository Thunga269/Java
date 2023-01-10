/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class bang_thu_nhap_GV {

    public static int cnt = 1;
    public static class Teacher{
        String id, name ;
        int wage;
        public Teacher(String a,String b,int c){
            id = a;
            name = b ;
            wage= c;
        }
        public int allowance(){
            String s  = id.substring(0,2);
            if (s.equals("HT")) return 2000000;
            if (s.equals("HP")) return 900000;
            return 500000;
        }
        public int rateSalary(){
            return Integer.valueOf(id.substring(2));
        }
        public int totalSalary(){
            return allowance()+rateSalary()*wage;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+rateSalary()+" "+allowance()+" "+totalSalary();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        List<String>  ds = new ArrayList<>();
        while (t-- >0) {
            sc.nextLine();
            String s1 =sc.nextLine();
            String s2  = s1.substring(0,2);
            Teacher te = new Teacher(s1, sc.nextLine(), sc.nextInt());
            ds.add(s2);
            int cnt = Collections.frequency(ds, s2);
            if (s2.equals("HT") && cnt >1)  continue;
            if (s2.equals("HP") && cnt >2 ) continue;
            System.out.println(te);
        }
    }
}
