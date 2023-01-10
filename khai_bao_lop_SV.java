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
public class khai_bao_lop_SV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String birth = sc.nextLine();
        float GPA = sc.nextFloat();
        
        SinhVien sv = new SinhVien(name, lop, birth, GPA);
        sv.chuan_hoa();
        System.out.print("B20DCCN001 "+ sv.getName()+" "+sv.getLop()+" "+sv.getBirth()+" ");
        System.out.format("%.2f", sv.getGPA());
    }
}
class SinhVien{
    private String name, lop, birth ;
    private float GPA;
    public SinhVien(){
        
    }
    public SinhVien(String name, String lop, String birth, float GPA){
        
        this.name=name;
        this.lop=lop;
        this.birth=birth;
//        birth = chuan_hoa(birth);
        this.GPA=GPA;
    }
    public String getName(){
        return name;
    }
    public String getLop(){
        return lop;
    }
    public String getBirth(){
        return birth;
    }
    public float getGPA(){
        return GPA;
    }
    public void chuan_hoa(){
        StringBuffer ss = new StringBuffer(this.birth);
        if(ss.charAt(1)=='/') ss.insert(0, "0");
        if(ss.charAt(4)=='/') ss.insert(3, "0");
        this.birth=ss.toString();
    }
}