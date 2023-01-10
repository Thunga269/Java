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
public class sx_don_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int t = Integer.valueOf(s);
        List<DonHang> L = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            L.add(DonHang.nextDonHang(sc));
        }
        
        Collections.sort(L, new Comparator<DonHang>(){
            @Override
            public int compare(DonHang d1, DonHang d2){
                return d1.getSTT().compareTo(d2.getSTT());
            }
        });
        for (DonHang dh:L)
            dh.Show();
    }
}
class DonHang{
    private String name, code, stt;
    private long dongia, soluong, discount, thanhTien;

    public DonHang() {
    }

    public DonHang(String name, String code, long dongia, long soluong) {
        this.name = name;
        this.code = code;
        this.dongia = dongia;
        this.soluong = soluong;
    }
//    public void setDis(){
//        char s = (this.code.charAt(this.code.length()-1));
//        if (s=='1'){
//            this.discount = (long) 0.5*this.dongia*this.soluong;
//        }else if(s=='2')
//            this.discount = (long) 0.3*this.dongia*this.soluong;
//    }
    public void setSTT(){
        String k = this.code.substring(1, 4);
        this.stt=k;
        
    }
    public String getSTT(){
        return stt;
    }
    public static DonHang nextDonHang(Scanner sc){
        DonHang d = new DonHang();
        d.name = sc.nextLine();
        d.code = sc.nextLine();
        d.dongia = Integer.valueOf(sc.nextLine());
        d.soluong=Integer.valueOf(sc.nextLine());
        char s = (d.code.charAt(d.code.length()-1));
        if (s=='1'){
            d.discount = (long) (50*d.dongia*d.soluong)/100;
        }else if(s=='2')
            d.discount = (long) (30*d.dongia*d.soluong)/100;
        d.setSTT();
        
        d.thanhTien= d.dongia*d.soluong-d.discount;
        return d;
    }
    public void Show(){
        System.out.println(this.name +" "+this.code+" "+this.stt+" "+this.discount+" "+this.thanhTien);
    }
}