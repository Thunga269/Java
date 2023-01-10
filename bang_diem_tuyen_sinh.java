/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class bang_diem_tuyen_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Sinv> L = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            L.add(Sinv.nexSinv(sc));
        }
        for(Sinv s:L){
            s.Show();
        }
    }
    
}
class Sinv{
    private String code, name, type;
    private double toan, ly, hoa, uutien, tong1, tong;

    public Sinv() {
    }

    public Sinv(String code, String name, float toan, float ly, float hoa) {
        this.code = code;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
//        this.tong = this.hoa+this.ly+this.toan;
//        setTong();
    }
    public void setTong(){
        String k = code.substring(0, 3);
        if(k.equals("KV1")){
            this.uutien = 0.5;
            this.tong += 0.5;
        }else if(k.equals("KV2")){
            this.uutien = 1;
            this.tong += 1;
        }else if(k.equals("KV3")){
            this.uutien = 2.5;
            this.tong += 2.5;
        }
        
    }
    public void setType(){
        if(this.tong >= 24) this.type="TRUNG TUYEN";
        else this.type = "TRUOT";
    }
    public static Sinv nexSinv(Scanner sc){
        Sinv s = new Sinv();
        s.code = sc.nextLine();
        s.name=sc.nextLine();
        s.toan= Double.valueOf(sc.nextLine());
        s.ly = Double.valueOf(sc.nextLine());
        s.hoa=Double.valueOf(sc.nextLine());
        s.tong = s.toan*2+s.ly+s.hoa;
        s.tong1 = s.tong;
        s.setTong();
        s.setType();
        
        return s;
    }
    public void Show(){
        System.out.print(this.code + " " + this.name + " " );
        if(this.uutien==(int)this.uutien) System.out.format("%.0f",this.uutien);
        else System.out.format("%.1f",this.uutien);
        System.out.print(" ");
        if(this.tong1 == (int) this.tong1) {
            System.out.format("%.0f ",(this.tong1));
        }
        else System.out.format("%.1f ",(this.tong1));
        System.out.println(this.type+" ");
    }
}