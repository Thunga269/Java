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
public class tong_phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo k1 = new PhanSo(a, b);
        a = sc.nextLong();
        b = sc.nextLong();
        PhanSo k2 = new PhanSo(a, b);
        k1.RutGon();
        k2.RutGon();
        long tu = (long)k1.getTu()*k2.getMau()+(long)k1.getMau()*k2.getTu();
        long mau = (long)k1.getMau()*k2.getMau();
        PhanSo h = new PhanSo(tu, mau);
        h.RutGon();
        System.out.println(h.getTu()+"/"+h.getMau());
    }
}
class PhanSo{
    private long tu;
    private long mau;
    public PhanSo(){
        this.tu = 1;
        this.mau=1;
    }
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
        
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public void RutGon(){
        long tmp = gcd(this.tu, this.mau);
        this.tu /= tmp;
        this.mau/= tmp;
    }
    public static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    
    public static long lcm(long a, long b){
        return (long) a*b/gcd(a, b);
    }
}
