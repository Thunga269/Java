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
import java.io.*;
public class CLB_bong_da2 {
     public static void main(String[] args) throws FileNotFoundException{
//        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.in");
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List <BongDa> L = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            L.add(BongDa.nexBongDa(sc));
        }
        int n = Integer.valueOf(sc.nextLine());
        List<BongDa> r = new ArrayList<>();
        for(int i=1; i <= n; i++){
            String m[]=sc.nextLine().split(" ");
            String maTran = m[0];
            long coDong = Long.parseLong(m[1]);
            String c = maTran.substring(1,3);
            for(BongDa bd:L){
                if(bd.getMa().equals(c)){
                    bd.setMatch(m[0], coDong);
                    r.add(bd);
                }
            }
        }
        Collections.sort(r, new Comparator<BongDa>(){
            @Override
            public int compare(BongDa b1, BongDa b2){
                if(b1.getDoanhThu()!= b2.getDoanhThu()){
                    return (int)(b2.getDoanhThu()-b1.getDoanhThu());
                }
                return b1.getTen().compareTo(b2.getTen());
            }
        });
        for(BongDa b : r)
            System.out.println(b);
     }
}
class BongDa{
    private String ma, ten, codeMatch;
    private long gia, doanhThu;

    public BongDa() {
    }

    public BongDa(String ma, String ten, long gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
    public void setMatch(String s, long coDong){
        this.codeMatch = s;
        this.doanhThu= coDong*this.gia;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public Long getGia(){
        return gia;
    }
    public Long getDoanhThu(){
        return doanhThu;
    }
    public static BongDa nexBongDa(Scanner sc) {
        BongDa b = new BongDa(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        return b;
    }
    @Override
    public String toString(){
        return codeMatch+" "+ten+" "+doanhThu;
    }
}