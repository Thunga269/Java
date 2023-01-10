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
public class sx_ds_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tm = sc.nextLine();
        int n = Integer.valueOf(tm);
        tm.isEmpty();
        List<NhanVien> list = new ArrayList<>();
        for(int i = 1; i <= n; ++i){
            list.add(NhanVien.nextNhanVien(sc, i));
        }
        Collections.sort(list, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien n1, NhanVien n2){
                if(n1.getYear() != n2.getYear())
                    return (int) (n1.getYear()-n2.getYear());
                if(n1.getMonth() != n2.getMonth())
                    return (int) (n1.getMonth()-n2.getMonth());
                
                return (int) (n1.getDay() - n2.getDay());
            }
        });
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
    
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String getBirth(){
        return birth;
    }
    public String getAdd(){
        return add;
    }
    public String getCode_thue(){
        return code_thue;
    }
    public String getDate_hd(){
        return date_hd;
    }
    //11/12/2002
    public int getYear(){
        String s = this.birth;
        return 1000 * (s.charAt(6) - 48) + 100 * (s.charAt(7) - 48) + 10 * (s.charAt(8) - 48) + s.charAt(9) - 48;
    }
    public int getMonth(){
        String s = this.birth;
        return 10 * (s.charAt(3) - 48) + s.charAt(4) - 48;
    }
    public int getDay(){
        String s = this.birth;
        return 10 * (s.charAt(0) - 48) + s.charAt(1) - 48;
    }
    

    public void Show(){
        System.out.print(this.code + " ");
        System.out.print(this.name + " " + this.sex + " " + this.birth + " " + this.add + " " + this.code_thue + " " + this.date_hd);
        System.out.println();
    }
}