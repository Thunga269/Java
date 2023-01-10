/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.quanlythisinh;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.math.*;
//import codeptit.quanlythisinh.ThiSinh;
public class PhongThi {
    private String mapt;
    private String phongthi;
    private int soluong;
    private ArrayList<ThiSinh> list;
    public PhongThi() { }
    public PhongThi(String mapt,
    String phongthi, int soluong) {
    this.mapt = mapt;
    this.phongthi = phongthi;
    this.soluong = soluong;
    list = new ArrayList<ThiSinh>();
    }
    public boolean themThiSinh() {

        Scanner input=new Scanner(System.in);
        System.out.println("Nhap thong tin thi sinh");
        System.out.print("\n Nhap so bao danh:");
        String sobaodanh = input.nextLine();
        ThiSinh ts = new ThiSinh(sobaodanh);
        if(list.contains(ts))
        return false;

        System.out.print("\n Nhap Ho ten: ");
        String hoten=input.nextLine();
        ts.setHoten(hoten);
        return list.add(ts);
        }
   public boolean xoaThiSinh(){
    Scanner input=new
    Scanner(System.in);
    System.out.print("\n Nhap so bao danh thi sinh can xoa: ");
    String sobaodanh = input.nextLine();
    ThiSinh ts = new ThiSinh(sobaodanh,"",0f,0f,0f);
    if(!list.contains(ts))
    return false;
    return list.remove(ts);
    }
   public ThiSinh layThiSinh() {
    Scanner input=new
    Scanner(System.in);
    System.out.print("\n Nhap so bao danh: ");
    String sobaodanh = input.nextLine();
    ThiSinh ts = new ThiSinh(sobaodanh,"",0f,0f,0f);
    if(!list.contains(ts))
    return null;
    ts = list.get(list.indexOf(ts));
    return ts;
    }
   public ArrayList<ThiSinh>
    layThiSinhByName(String ten) {
    ArrayList<ThiSinh> l= new ArrayList<>();
    int i=0;
    for(ThiSinh ts:list){
        if(ts.getHoten().equalsIgnoreCase(ten)){
            l.add(ts);
            i++;
            }
        }
    if(i==0)
        return null;
    else
        return l;
    }
    public ArrayList<ThiSinh>
        layThiSinhByDiem(float from, float to) {

        ArrayList<ThiSinh> l= new

        ArrayList<>();
        int i=0;
        for(ThiSinh ts:list){

        if(ts.getToan()>=from && ts.getToan()<=to){
            l.add(ts);
            i++;
            }
        }
        if(i==0)
            return null;
        else
            return l;
        }
    public void inDanhSach(){
        System.out.println("=DANH SACH SINH VIEN=");
        System.out.println("So BD Ho va ten Diem Toan Diem Ly Diem Hoa");
        for (ThiSinh sv: list)
        System.out.println(sv.toString());
        System.out.println("=====================================");
        }
    public void nhapDiem(){

        Scanner in=new Scanner(System.in);
        inDanhSach();
        float dt,dl,dh;
        int i=0;
        for(ThiSinh t:list){
        System.out.println("So bao danh:"+t.getSobaodanh());
        System.out.print("Nhap diem toan:");
        dt=Float.parseFloat(in.nextLine());
        System.out.print("\n Nhap diem ly:");
        dl=Float.parseFloat(in.nextLine());
        System.out.print("\n Nhap diem hoa:");
        dh=Float.parseFloat(in.nextLine());
        t=list.get(i); t.setToan(dt);
        t.setLy(dl); t.setHoa(dh);
        i++;
        }
    }
    
}
