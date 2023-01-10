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
public class tinh_thu_nhap_GV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        int luong = sc.nextInt();
        GiaoVien gv = new GiaoVien(ma, ten, luong);
        gv.check();
        System.out.println(gv.getMa()+" "+gv.getTen()+" "+gv.getHe_So()+" "+gv.getPhuCap()+" "+gv.getSum());
        
    }
}
class GiaoVien{
    private String ma, ten;
    int luong, he_so, phu_cap, sum;
    
    public GiaoVien(){
        
    }
    public GiaoVien(String ma, String ten, int luong){
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
//        this.he_so=0;
//        this.phu_cap=0;
//        this.sum=0;
    }
    public void check(){
        String k = ma.substring(0, 2);
        String m = ma.substring(2, 4);
        he_so = Integer.parseInt(m);
        if(k.equals("HT")){
            phu_cap= (int)2000000;
            sum = luong * he_so + 2000000;
        }else if(k.equals("HP")){
            phu_cap= (int)900000;
            sum = luong * he_so + 900000;
        }else if(k.equals("GV")){
            phu_cap=(int)500000;
            sum = luong * he_so + 500000;
        }
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public int getHe_So(){
        return he_so;
    }
    public int getPhuCap(){
        return phu_cap;
    }
    public int getSum(){
        return sum;
    }
    
    
}