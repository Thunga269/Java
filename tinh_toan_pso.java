/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class tinh_toan_pso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            PhanSo k1 = new PhanSo(a, b);
            a = sc.nextLong();
            b = sc.nextLong();
            PhanSo k2 = new PhanSo(a, b);
            k1.RutGon();
            k2.RutGon();
            PhanSo C = new PhanSo();
            C = k1.sum(k2);
            C = C.tich(C);
            PhanSo D = new PhanSo();
            D = k1.tich(k2);
            D = D.tich(C);
//            C.RutGon();
//            D.RutGon();
            System.out.println(C+" "+D);
            }
        
    }
}
class PhanSo{
    private long tu, mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
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
    public PhanSo sum(PhanSo ps1){
        PhanSo s = new PhanSo();
        s.tu = this.tu*ps1.mau+this.mau*ps1.tu;
        s.mau = this.mau*ps1.mau;
        s.RutGon();
        return s;
    }
    public PhanSo tich(PhanSo ps1){
        PhanSo s = new PhanSo();
        s.tu = this.tu*ps1.tu;
        s.mau = this.mau*ps1.mau;
        s.RutGon();
        return s;
    }
    public String toString(){
        return this.tu+"/"+this.mau;
    }
}