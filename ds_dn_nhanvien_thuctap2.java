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
public class ds_dn_nhanvien_thuctap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.valueOf(s);
        s.isEmpty();
        List<DoanhNghiep> L = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            L.add(DoanhNghiep.nexDoanhNghiep(sc));
        }
        s = sc.nextLine();
        int Q = Integer.valueOf(s);
        s.isEmpty();
        while(Q -->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Collections.sort(L, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep dn1, DoanhNghiep dn2){
                if(dn1.getNum()!=dn2.getNum())
                    return (int)(dn2.getNum()-dn1.getNum());
                return dn1.getMa().compareTo(dn2.getMa());
            }
            });
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(DoanhNghiep dn: L){
                if(dn.getNum()>=a && dn.getNum()<= b){
                    System.out.println(dn);
                }
        }
        
        }
        
    }
}
class DoanhNghiep{
    private String ma, name;
    private int num;

    public DoanhNghiep() {
    }

    public DoanhNghiep(String ma, String name, int num) {
        this.ma = ma;
        this.name = name;
        this.num = num;
    }
    public String getMa(){
        return ma;
    }
    public int getNum(){
        return num;
    }
    public static DoanhNghiep nexDoanhNghiep(Scanner sc){
        DoanhNghiep dn = new DoanhNghiep();
        dn.ma=sc.nextLine();
        dn.name=sc.nextLine();
        String s = sc.nextLine();
        dn.num = Integer.valueOf(s);
        s.isEmpty();
        return dn;
    }
    public String toString(){
        return this.ma +" "+this.name+" "+this.num;
    }
}