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
public class danh_sach_mat_hang {
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
            public int compare(MatHang mh1, MatHang mh2){
                if(mh1.getSum() != mh2.getSum()){
                    return (int) (mh2.getSum()-mh1.getSum());
                }
                return mh1.getMa().compareTo(mh2.getMa());
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
    private long giamua, giaban, sum;
    public MatHang(){
        
    }

    public MatHang( String ten, String donvi, long giamua, long giaban) {
        
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
    public long getMua(){
        return giamua;
    }
    public long getBan(){
        return giaban;
    }
    public long getSum(){
        return sum;
    }
    public void setMa(int cnt){
        String s = "MH"+cnt;
        while(s.length()<5) s = s.substring(0,2)+0+s.substring(2);
        this.ma = s;
    }
    public static MatHang nextMatHang(Scanner sc, int cnt){
        MatHang m = new MatHang();
        m.ten= sc.nextLine();
        m.donvi = sc.nextLine();
        m.giamua=Long.valueOf(sc.nextLine());
        m.giaban=Long.valueOf(sc.nextLine());
        m.sum = m.giaban-m.giamua;
        m.setMa(cnt);
        return m;
        
    }
    public void Show(){
        System.out.println(this.ma+" "+this.ten+" "+this.donvi+" "+this.giamua+" "+this.giaban+" "+this.sum);
    }
    
}