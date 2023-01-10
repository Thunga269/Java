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
import java.util.jar.Attributes;
public class khai_bao_lop_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gen = sc.nextLine();
        String ns = sc.nextLine();
        String dc = sc.nextLine();
        String ma = sc.nextLine();
        String ngay_khd = sc.nextLine();
        NhanVien nv = new NhanVien(ten, gen, ns, dc, ma, ngay_khd);
        System.out.println("00001 "+nv.getTen()+" "+nv.getGen()+" "+nv.getNs()+" "+nv.getDc()+" "+nv.getMa()+" "+nv.getNgayHd());
    }
}
class NhanVien{
    private String ten;
    private String gen;
    private String ns;
    private String dc;
    private String ma;
    private String ngay_khd;
    public NhanVien(){
        
    }
    public NhanVien(String ten, String gen, String ns,String dc, String ma, String ngay_khd){
        this.ten=ten;
        this.gen = gen;
        this.ns=ns;
        this.dc=dc;
        this.ma=ma;
        this.ngay_khd=ngay_khd;
    }
    public String getTen(){
        return ten;
    }
    public String getGen(){
        return gen;
    }
    public String getNs(){
        return ns;
    }
    public String getDc(){
        return dc;
    }
    public String getMa(){
        return ma;
    }
    public String getNgayHd(){
        return ngay_khd;
    }
}
