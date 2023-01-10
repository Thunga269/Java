/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.*;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class sx_MH_file {
     public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\MATHANG.in");
        Scanner sc = new Scanner(file);
        int t = Integer.valueOf(sc.nextLine());
        List <MatHangFile> L = new ArrayList<>();
        
        for(int i = 1; i <= t; i++){
            L.add(MatHangFile.nexMatHangFile(sc, i));
        }
        Collections.sort(L, new Comparator<MatHangFile>(){
            @Override
            public int compare(MatHangFile m1, MatHangFile m2){
                if((int)100*m1.getLoi()!=(int) 100* m2.getLoi()){
                    return (int)(100*(m2.getLoi()- m1.getLoi()));
                }
                return m1.getMa().compareTo(m2.getMa());
            }
        });
        for (MatHangFile m: L)
            m.Show();
    }
}
class MatHangFile{
    private String code, name, type;
    private float mua, ban, loi;

    public MatHangFile() {
    }

    public MatHangFile(String name, String type, float mua, float ban) {
//        this.code = code;
        this.name = name;
        this.type = type;
        this.mua = mua;
        this.ban = ban;
        
    }
    public void setMa(int cnt){
        String k = ""+cnt;
        while(k.length()<2) k = "0"+k;
        this.code = "MH"+k;
    }
    public float getLoi(){
        return loi;
    }
    public String getMa(){
        return code;
    }
    public static MatHangFile nexMatHangFile(Scanner sc, int cnt) {
        MatHangFile m = new MatHangFile();
        m.name = sc.nextLine();
        m.type = sc.nextLine();
        m.mua = Float.valueOf(sc.nextLine());
        m.ban = Float.valueOf(sc.nextLine());
        m.setMa(cnt);
        m.loi = (m.ban-m.mua);
        return m;
    }
    public void Show(){
        System.out.print(this.code + " "+this.name+" "+this.type+" ");
        System.out.format("%.2f", (float)this.loi);
        System.out.println();
    }
}