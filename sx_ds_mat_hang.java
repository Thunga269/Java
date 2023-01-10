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
public class sx_ds_mat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        int n = Integer.valueOf(m);
        m.isEmpty();
        List<MatHang> L = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            L.add(MatHang.nextMatHang(sc, i));
        }
        Collections.sort(L, new Comparator<MatHang>(){
            @Override
           public int compare(MatHang o1, MatHang o2){
                    return (int) ((int)100 * (o2.getSum() - o1.getSum()));
            }
        });
        for (MatHang matHang : L) {
            matHang.Show();
        }
        sc.close();
    }
}
class MatHang{
    private String ma, ten, donvi;
    private double giamua, giaban, sum;
    public MatHang(){
        
    }

    public MatHang( String ten, String donvi, double giamua, double giaban) {
        
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    public String getMa(){
        return ma;
    }
    public String getMH(){
        return ten;
    }
    public String getDV(){
        return donvi;
    }
    public double getMua(){
        return giamua;
    }
    public double getBan(){
        return giaban;
    }
    public double getSum(){
        return sum;
    }
    public void setMa(int cnt){
        String s = ""+cnt;
//        while(s.length()<5) s = s.substring(0,2)+0+s.substring(2);
        this.ma = s;
    }
    public static MatHang nextMatHang(Scanner sc, int cnt){
        MatHang m = new MatHang();
        m.ten= sc.nextLine();
        m.donvi = sc.nextLine();
        m.giamua=Double.valueOf(sc.nextLine());
        m.giaban=Double.valueOf(sc.nextLine());
        m.sum = m.giaban-m.giamua;
        m.setMa(cnt);
        return m;
        
    }
    public void Show(){
        System.out.print(this.ma+" "+this.ten+" "+this.donvi+" ");
        System.out.format("%.2f\n", (double)this.sum);
    }
    
    
}