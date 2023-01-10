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
public class BT_tuyen_sinh {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String address = ip.nextLine(), name = ip.nextLine();
        String p1 = ip.nextLine(), p2 = ip.nextLine(), p3 = ip.nextLine();
        DiemThi a = new DiemThi(address, name, Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3));
        a.Show();
        ip.close();
    }
}
class DiemThi{
    private String code, name;
    private float toan, ly, hoa;
   
    public DiemThi() {
    }

    public DiemThi(String code, String name, float toan, float ly, float hoa) {
        this.code = code;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public void Show(){
        String s = this.code;
        double p = this.toan * 2 + this.ly + this.hoa;
        double x = 0;
        if(s.charAt(2) == '1') x = 0.5;
        if(s.charAt(2) == '2') x = 1.0;
        if(s.charAt(2) == '3') x = 2.5;
        System.out.print(this.code + " " + this.name + " ");
        if(x == 1.0)
            System.out.format("%.0f ",(float)(x));
        else 
            System.out.format("%.1f ", (float)(x));
        if(p == (int) p)
            System.out.format("%.0f ",(float)(p));
        else 
            System.out.format("%.1f ", (float)(p));
        if(p + x >= 24) System.out.print("TRUNG TUYEN");
        else System.out.print("TRUOT");
        System.out.println();
    }
}