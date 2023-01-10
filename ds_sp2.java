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
public class ds_sp2 {
    public static void main(String[] args) throws FileNotFoundException{
//        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.in");
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List <XangDau> L = new ArrayList<>();
        for(int i = 1; i <= t;i++){
            L.add(SanP.nexSanP(sc));
        }
}
class SanP{
    private String ma, ten;
    private int gia, thoihan;

    public SanP() {
        }

    public SanP(String ma, String ten, int gia, int thoihan) {
            this.ma = ma;
            this.ten = ten;
            this.gia = gia;
            this.thoihan = thoihan;
        }
    public static SanP nexSanP(Scanner sc){
        SanP s = new SanP(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()));
        return s;
    }
    
}