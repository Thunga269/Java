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
public class ds_SV_file2 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\SV.in");
        Scanner sc = new Scanner(file);
        String k = sc.nextLine();
        int N = Integer.valueOf(k);
        k.isEmpty();
        List<SinhV> L = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            L.add(SinhV.nextSinhV(sc, i));
        }
        for(SinhV s : L)
            s.Show();
    }
}
class SinhV{
    private String name, maSV, lop, ns;
    float d;

    public SinhV() {
    }

    public SinhV(String name, String lop, String ns, float d) {
        this.name = name;
        this.lop = lop;
        this.ns = ns;
        this.d = d;
    }
    public void setMA(int cnt){
        String k = ""+cnt;
        while(k.length()<3) k = "0"+k;
        this.maSV = "B20DCCN"+k;
    }
    public static SinhV nextSinhV(Scanner sc, int cnt ){
        SinhV sv = new SinhV();
        sv.setMA(cnt);
        sv.name = sc.nextLine();
        sv.lop = sc.nextLine();
        String s = sc.nextLine();
        if(s.charAt(1) == '/') s = "0" + s;
        if(s.charAt(4) == '/') s = s.substring(0, 3) + "0" + s.substring(3, s.length());
        sv.ns = s;
        sv.d = Float.valueOf(sc.nextLine());
        return sv;
             
    }
   public void Show(){
        System.out.print(this.maSV + " " + this.name + " " + this.lop + " " + this.ns + " ");
        System.out.format("%.2f\n", (float)this.d);
    }
}