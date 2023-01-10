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
import java.math.*;
public class khai_bao_lop_thi_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        double sb1 = sc.nextDouble();
        double sb2 = sc.nextDouble();
        double sb3 = sc.nextDouble();
        Student a = new Student(name, birth, sb1, sb2, sb3);
        System.out.print(a.getName()+" "+a.getBirth()+" ");
        System.out.format("%.1f", (double) a.Tong(sb1, sb2, sb3));
    }
}
class Student{
    private String name, birth;
    private double sb1, sb2, sb3;
    public Student(){
        this.name = "";
        this.birth="";
        this.sb1=0.0;
        this.sb2=0.0;
        this.sb3=0.0;
    }
    public Student(String name, String birth, double sb1, double sb2, double sb3){
        this.name = name;
        this.birth=birth;
        this.sb1=sb1;
        this.sb2=sb2;
        this.sb3=sb3;
    }
    public String getName(){
        return name;
    }
    public String getBirth(){
        return birth;
    }
    public double getsb1(){
        return sb1;
    }
    public double getsb2(){
        return sb2;
    }
    public double getsb3(){
        return sb3;
        
    }
    public double Tong(double sb1, double sb2, double sb3){
        return (double) sb1+sb2+sb3;
    }
}
