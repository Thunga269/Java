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
public class phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Phanso k = new Phanso(a, b);
        k.rut_gon();
        System.out.println(k.getTu()+"/"+k.getMau());
        
    }
}
class Phanso{
    private long tu;
    private long mau;
    public Phanso(){
        this.tu = 1;
        this.mau = 1;
    }
    public Phanso(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public void rut_gon(){
        long tmp = gcd(this.tu, this.mau);
        this.tu/=tmp;
        this.mau/=tmp;
    }
    public static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static long lcm(long a, long b){
        return (long) a*b/gcd(a, b);
    }
}
