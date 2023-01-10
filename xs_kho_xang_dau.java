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
public class xs_kho_xang_dau {
    public static void main(String[] args) throws FileNotFoundException{
//     File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.in");
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(file);
        int t = Integer.valueOf(sc.nextLine());
        List <XangDau1> L = new ArrayList<>();
        for(int i = 1; i <= t;i++){
            L.add(XangDau1.nexXangDau1(sc));
        }
        Collections.sort(L);
        
        for(XangDau1 xangDau:L)
            xangDau.Show();
        
    }
}
class XangDau1 implements  Comparable<XangDau1>{
    private String ma, hang;
    private long so, dongia, thue, thanhtien;

    public XangDau1() {
        this.ma = this.hang="";
        this.so = this.dongia=this.thue = this.thanhtien=0;
    }

    public XangDau1(String ma, long so) {
        this.ma = ma;
        this.so = so;
    }
    public long getTien(){
        return thanhtien;
    }
    public static XangDau1 nexXangDau1(Scanner sc) {
        XangDau1 x = new XangDau1();
        String k = sc.nextLine();
        String []m = k.split(" ");
        x.ma = m[0];
        x.so = Long.parseLong(m[1]);
        String Ma = m[0].substring(0,1);
        String MaSX = m[0].substring(m[0].length()-2); 
        if(Ma.equals("N")){
            x.dongia = 9700;
            x.thue = x.so*9700*2/100;
        }
        else if(Ma.equals("D")){
            x.dongia = 11200;
            x.thue = x.so*392;
        }
        else if(Ma.equals("X")){
            x.dongia = 128000;
            x.thue = x.so*128000*3/100;
        }
        if(MaSX.equals("BP")) x.hang = "British Petro";
        else if(MaSX.equals("ES")) x.hang="Esso";
        else if(MaSX.equals("SH")) x.hang="Shell";
        else if(MaSX.equals("CA")) x.hang="Castrol";
        else if(MaSX.equals("MO")) x.hang="Mobil";
        else if(MaSX.equals("TN")){
            x.hang="Trong Nuoc";
            x.thue = 0;
        }
        x.thanhtien=x.dongia*x.so+x.thue;
                
        return x;
                
        
    }
    
    public void Show(){
        System.out.println(this.ma +" "+this.hang+" "+this.dongia+" "+this.thue+" "+this.thanhtien);
    }
    @Override
    public int compareTo(XangDau1 o) {
        if(o.getTien() > this.getTien())
            return 1;
        return -1;
    }
}