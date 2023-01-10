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
public class ds_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tm = sc.nextLine();
        int n = Integer.valueOf(tm);
        tm.isEmpty();
        List<NhanVien> list = new ArrayList<>();
        for(int i = 1; i <= n; ++i){
            list.add(NhanVien.nextNhanVien(sc, i));
        }
        for (NhanVien nv : list) {
            nv.Show();
        }
        sc.close();
    }
}
class NhanVien{
    private String code, name, sex, birth, add, code_thue, date_hd;

    public NhanVien() {
    }


    //chong toan tu Nhap/xuat
    public void setCode(int cnt){
        String s = "000" + cnt;
        while(s.length() < 5) s = s.substring(0, 3) + "0" + s.substring(3);
        this.code = s;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAddress(String address){
        this.add = address;
    }
    public void setCode_thue(String code){
        this.code_thue = code;
    }
    public void setDate_hd(String date_hd){
        this.date_hd = date_hd;
    }
        public NhanVien( String name, String sex, String birth, String add, String code_thue, String date_hd) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.add = add;
        this.code_thue = code_thue;
        this.date_hd = date_hd;
    }
    public static String trueDate(String s){
        if(s.charAt(1) == '/') s = "0" + s;
        if(s.charAt(4) == '/') s = s.substring(0, 3) + "0" + s.substring(3, s.length());
        return s;
    }

    public static NhanVien nextNhanVien(Scanner sc, int cnt){
        NhanVien a = new NhanVien();
        a.setCode(cnt);
        a.name = sc.nextLine();
        a.sex = sc.nextLine();
        a.birth = trueDate(sc.nextLine());
        a.add = sc.nextLine();
        a.code_thue = sc.nextLine();
        a.date_hd = sc.nextLine();
        return a;
    }

    public void Show(){
        System.out.print(this.code + " ");
        System.out.print(this.name + " " + this.sex + " " + this.birth + " " + this.add + " " + this.code_thue + " " + this.date_hd);
        System.out.println();
    }
}