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
public class so_phuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            int ao = sc.nextInt();
            int thuc = sc.nextInt();           
            So s1 = new So(ao, thuc);
            ao = sc.nextInt();
            thuc = sc.nextInt();
            So s2 = new So(ao, thuc);
            So tong = (s1.sum(s2));
            System.out.print(tong.tich(s1) + ", ");
            System.out.println(tong.tich(tong));
            
        }
    }
}
class So{
    private int thuc, ao;

    public So() {
    }

    public So(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
//    public static So nextSo(Scanner sc) {
//        So s = new So();
//        s.ao=sc.nextInt();
//        s.thuc=sc.nextInt();
//        return s;
//    }
    public So sum(So s1){
        So s = new So();
        s.ao = this.ao + s1.ao;
        s.thuc= this.thuc+s1.thuc;
        return s;
    }
    public So tich(So s1){
        So s = new So();
        s.thuc = -this.ao*s1.ao+this.thuc*s1.thuc;
        s.ao= this.thuc*s1.ao + s1.thuc*this.ao;
        return s;
    }
    public String toString(){
        if(this.ao < 0){
            this.ao = -this.ao;
            return this.thuc+" - "+this.ao+"i";
        }
        else
            return this.thuc+" + "+this.ao+"i";
    }
}