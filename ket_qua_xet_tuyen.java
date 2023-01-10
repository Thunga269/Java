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
public class ket_qua_xet_tuyen  {
    public static int cnt = 1;
    public static class Candidate{
        String id,name,birth ;
        double d1 , d2;
        public Candidate(String a, String b,double c ,double d){
            id = "PH"+"00".substring(Integer.toString(cnt).length())+Integer.toString(cnt++);
            name = a;
            birth= b;
            d1 = c;
            d2= d;
        }
        public int age(){
            String []str  = birth.split("/");
            return 2021- Integer.valueOf(str[2]);
        }
        public double rewardPoint(){
            if (d1 >=8 && d2 >=8) return 1;
            if (d1 >=7.5 && d2 >7.5) return 0.5;
            return 0;
        }
        public int ratingPoint(){
            int res =  (int)Math.round((d2+d1)*0.5+rewardPoint());
            if(res >=10) return 10;
            return res;
        }
        public String classification(){
             if (ratingPoint()<5) return "Truot";
             if (ratingPoint()<=6) return "Trung binh";
             if (ratingPoint()==7) return "Kha";
             if (ratingPoint()==8) return "Gioi";
             return "Xuat sac";
        }
        @Override
        public String toString(){
            return id+" "+name+" "+age()+" "+ratingPoint()+" "+classification();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            sc.nextLine();
            System.out.println(new Candidate(sc.nextLine(),sc.next(),sc.nextDouble(),sc.nextDouble()));
        }
    }
}